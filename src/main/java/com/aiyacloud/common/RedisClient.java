package com.aiyacloud.common;

import com.aiyacloud.common.utils.JsonUtils;
import com.fasterxml.jackson.databind.JavaType;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.data.redis.core.ZSetOperations.TypedTuple;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Redis方法
 */
public class RedisClient {

    private RedisTemplate<String, String> redisTemplate;

    public RedisClient(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 模糊匹配所有的key
     */
    public Collection<String> keys(String pattern) {
        return redisTemplate.keys(pattern);
    }


    public <T> T get(RedisKey.KeyType keyType) {
        return (T) get(keyType.getKey(), keyType.getType());
    }

    public <T> T get(RedisKey.KeyType keyType, String key) {
        return (T) get(keyType.getKey(key), keyType.getType());
    }

    /**
     * 从redis中取得数据（简单key-value型）
     *
     * @param key redis中的key
     * @author wangws
     */
    @SuppressWarnings("unchecked")
    public Object get(String key, Type type) {
        if (key == null || (!(type instanceof Class) && !(type instanceof JavaType))) {
            return null;
        }

        ValueOperations<String, String> valueOper = redisTemplate.opsForValue();
        String json = valueOper.get(key);
        if (type.getTypeName().equals("java.lang.String"))
            return json;
        if (type instanceof Class) {
            return JsonUtils.json2Object(json, (Class<Object>) type);
        } else if (type instanceof JavaType) {
            return JsonUtils.json2Object(json, (JavaType) type);
        } else {
            return null;
        }
    }

    /**
     * 存入数据至redis（简单key-value型）
     *
     * @param key    redis中的key
     * @param value  要存入的数据，会转换成json字符串存入redis
     * @param expire 过期时间(单位：秒)，如果小于0,则为无过期时间; 如果等于零，会删除当前数据; 如果为null，则延续之前的过期时间
     * @author wangws
     */
    public void set(final String key, final Object value, Long expire) {
        if (key == null || value == null) {
            return;
        }
        String json;
        if (!(value instanceof String)) {
            json = JsonUtils.object2Json(value);
        } else {
            json = (String) value;
        }
        ValueOperations<String, String> valueOper = redisTemplate.opsForValue();
        expire = expire == null ? redisTemplate.getExpire(key, TimeUnit.SECONDS) : expire;

        if (expire == null || expire < 0) {
            valueOper.set(key, json);
        } else if (expire == 0L) {
            redisTemplate.delete(key);
        } else {
            valueOper.set(key, json, expire, TimeUnit.SECONDS);
        }
    }

    /**
     * 从redis删除一条数据
     *
     * @param key redis中的key
     * @author wangws
     */
    public void delete(final String key) {
        if (key == null) {
            return;
        }

        redisTemplate.delete(key);
    }

    /**
     * 存入数据至redis（SortedSet（有序集合））
     *
     * @param key   redis中的key
     * @param value 要存入的值
     * @param score 该value在set中的权重
     * @author wangws
     */
    public void zsetAdd(final String key, final Object value, final double score) {
        if (key == null || value == null) {
            return;
        }

        ZSetOperations<String, String> zsetOper = redisTemplate.opsForZSet();
        zsetOper.add(key, JsonUtils.object2Json(value), score);
    }

    /**
     * 增加key值的计数
     * @param key
     * @param value
     */
    public void incr(String key, Long value) {
        ValueOperations<String, String> valueOper = redisTemplate.opsForValue();
        valueOper.increment(key, value);
    }

    /**
     * 存入多条数据至redis（SortedSet（有序集合））
     *
     * @param key redis中的key
     * @author wangws
     */
    public void zsetAdd(final String key, final Set<TypedTuple<String>> tuples) {
        if (key == null || tuples == null) {
            return;
        }

        ZSetOperations<String, String> zsetOper = redisTemplate.opsForZSet();
        zsetOper.add(key, tuples);
    }

    /**
     * 计算SortedSet（有序集合）某key对应的set的size
     *
     * @param key redis中的key
     * @author wangws
     */
    public Long zsetCart(final String key) {
        ZSetOperations<String, String> zsetOper = redisTemplate.opsForZSet();
        return zsetOper.zCard(key);
    }

    /**
     * 取得score在区间内的数据,按score从小到大排列（SortedSet（有序集合））
     *
     * @param key   redis中的key
     * @param start 区间开始下标
     * @param end   区间结束下标
     * @author wangws
     */
    @SuppressWarnings("unchecked")
    public Set<Object> zsetRange(final String key, long start, long end, Type type) {
        if (key == null || (!(type instanceof Class) && !(type instanceof JavaType))) {
            return null;
        }

        Set<Object> objSet = null;

        ZSetOperations<String, String> zsetOper = redisTemplate.opsForZSet();
        Set<String> strSet = zsetOper.range(key, start, end);
        if (strSet != null) {
            objSet = new LinkedHashSet<>(strSet.size());
            if (type instanceof Class) {
                for (String json : strSet) {
                    objSet.add(JsonUtils.json2Object(json, (Class<Object>) type));
                }
            } else if (type instanceof JavaType) {
                for (String json : strSet) {
                    objSet.add(JsonUtils.json2Object(json, (JavaType) type));
                }
            }
        }

        return objSet;
    }

    /**
     * 取得score在区间内的数据,按score从大到小排列（SortedSet（有序集合））
     *
     * @param key   redis中的key
     * @param start 区间开始下标
     * @param end   区间结束下标
     * @author wangws
     */
    @SuppressWarnings("unchecked")
    public Set<Object> zsetRevrange(final String key, long start, long end, Type type) {
        if (key == null || (!(type instanceof Class) && !(type instanceof JavaType))) {
            return null;
        }

        Set<Object> objSet = null;

        ZSetOperations<String, String> zsetOper = redisTemplate.opsForZSet();
        Set<String> strSet = zsetOper.reverseRange(key, start, end);

        if (strSet != null) {
            objSet = new LinkedHashSet<>(strSet.size());
            if (type instanceof Class) {
                for (String json : strSet) {
                    objSet.add(JsonUtils.json2Object(json, (Class<Object>) type));
                }
            } else if (type instanceof JavaType) {
                for (String json : strSet) {
                    objSet.add(JsonUtils.json2Object(json, (JavaType) type));
                }
            }
        }

        return objSet;
    }

    /**
     * 设置redis key的过期时间
     *
     * @param key    redis中的key
     * @param expire 过期时间(单位：秒)
     * @author wangws
     */
    public void expire(String key, long expire) {
        if (key == null) {
            return;
        }

        redisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    /**
     * 取得redis key的过期时间（单位：毫秒。注意这里是毫秒）
     *
     * @param key redis中的key
     * @author wangws
     */
    public long getExpire(String key) {

        return redisTemplate.getExpire(key, TimeUnit.MILLISECONDS);
    }

    /**
     * 判断redis是否存在该key
     *
     * @param key redis中的key
     * @author wangws
     */
    public boolean hasKey(final String key) {

        return redisTemplate.hasKey(key);
    }

}
