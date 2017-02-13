package com.aiyacloud.common.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.NullNode;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class JsonUtils {

    /**
     * 不可实例化
     */
    private JsonUtils() {
    }

    private final static Logger logger = Logger.getLogger(JsonUtils.class);

    private static ObjectMapper defaultMapper;
    private static Map<DateFormat, ObjectMapper> dateFormatMappers = new ConcurrentHashMap<>();

    static {
        defaultMapper = new AllowNullMapper();

        defaultMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        // 配置为true表示mapper接受只有一个元素的数组的反序列化
        defaultMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        // mapper在遇到mapper对象中存在json对象中没有的数据变量时不报错，可以进行反序列化
        defaultMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * 将null转为"" ,注意除了String以外其他类型会报错
     */
    public static class AllowNullMapper extends ObjectMapper {
        public AllowNullMapper() {
            super();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.setDateFormat(simpleDateFormat);
            this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            // 配置为true表示mapper接受只有一个元素的数组的反序列化
            this.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            // mapper在遇到mapper对象中存在json对象中没有的数据变量时不报错，可以进行反序列化
            this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            // 空值处理为空串
            this.getSerializerProvider().setNullValueSerializer(new NullStringSerializer());
            //格式化BigDecimal
            SimpleModule decimalModule = new SimpleModule();
            decimalModule.addSerializer(BigDecimal.class, new BigDecimalSerializer());
            //格式化日期
            decimalModule.addSerializer(Date.class,new DateSerializer());
            this.registerModule(decimalModule);
        }
    }

    /**
     * 格式化BigDecimal,保留两位小数
     */
    public static class BigDecimalSerializer extends JsonSerializer<BigDecimal> {

        @Override
        public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
            if (value != null)
                gen.writeString(value.setScale(2, BigDecimal.ROUND_HALF_UP).toString());
        }
    }


    public static class DateSerializer extends JsonSerializer<Date> {


        @Override
        public void serialize(Date date, JsonGenerator gen, SerializerProvider arg2)
                throws IOException, JsonProcessingException {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = format.format(date);
            gen.writeString(formattedDate);
        }

    }

    /**
     * 将null转为"" ,注意除了String以外其他类型会报错
     */
    public static class NullStringSerializer extends JsonSerializer<Object> {

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("");
        }
    }

    public static String object2Json(Object o) {

        return object2Json(o, null);
    }

    public static String object2Json(Object o, DateFormat dataFormat) {
        String s = "";
        if (o != null) {
            ObjectMapper om;
            if (dataFormat == null) {
                om = defaultMapper;
            } else {
                om = getFromMap(dataFormat);
            }

            try {
                s = om.writeValueAsString(o);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("转为json格式出错 -- object=" + o, e);
            }
        }

        return s;
    }

    public static <T> T json2Object(String json, Class<T> c) {

        return json2Object(json, c, null);
    }

    public static <T> T json2Object(String json, Class<T> c, DateFormat dataFormat) {
        T t = null;
        if (json != null) {
            ObjectMapper om;
            if (dataFormat == null) {
                om = defaultMapper;
            } else {
                om = getFromMap(dataFormat);
            }

            try {
                t = om.readValue(json, c);
            } catch (IOException e) {
                throw new RuntimeException("json转class出错 -- json=" + json + ", class=" + c.getName(), e);
            }
        }


        return t;
    }

    public static <T> T json2Object(String json, TypeReference<T> tr) {

        return json2Object(json, tr, null);
    }

    @SuppressWarnings("unchecked")
    public static <T> T json2Object(String json, TypeReference<T> tr, DateFormat dataFormat) {
        T t = null;
        if (json != null) {
            ObjectMapper om;
            if (dataFormat == null) {
                om = defaultMapper;
            } else {
                om = getFromMap(dataFormat);
            }

            try {
                t = om.readValue(json, tr);
            } catch (IOException e) {
                throw new RuntimeException("json转typeReference出错 -- json=" + json + ", typeReference=" + tr.getType(),
                        e);
            }
        }

        return t;
    }

    public static <T> T json2Object(String json, JavaType javaType) {

        return json2Object(json, javaType, null);
    }

    @SuppressWarnings("unchecked")
    public static <T> T json2Object(String json, JavaType javaType, DateFormat dataFormat) {
        T t = null;
        if (json != null) {
            ObjectMapper om;
            if (dataFormat == null) {
                om = defaultMapper;
            } else {
                om = getFromMap(dataFormat);
            }

            try {
                t = om.readValue(json, javaType);
            } catch (IOException e) {
                throw new RuntimeException("json转javaType出错 -- json=" + json + ", javaType=" + javaType, e);
            }
        }

        return t;
    }

    public static <T> T is2Object(InputStream is, Class<T> c) {
        return is2Object(is, c, null);
    }

    public static <T> T is2Object(InputStream is, Class<T> c, DateFormat dataFormat) {
        T o = null;
        if (is != null) {
            ObjectMapper om;
            if (dataFormat == null) {
                om = defaultMapper;
            } else {
                om = getFromMap(dataFormat);
            }
            try {
                o = om.readValue(is, c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return o;
    }

    public static <T> T is2Object(InputStream is, TypeReference<T> tr) {
        return is2Object(is, tr, null);
    }

    public static <T> T is2Object(InputStream is, TypeReference<T> tr, DateFormat dataFormat) {
        T o = null;
        if (is != null) {
            ObjectMapper om;
            if (dataFormat == null) {
                om = defaultMapper;
            } else {
                om = getFromMap(dataFormat);
            }
            try {
                o = om.readValue(is, tr);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return o;
    }

    /**
     * 获取泛型的JavaType
     *
     * @param objectClass    泛型的objectClass
     * @param elementClasses 元素类
     * @return JavaType Java类型
     */
    public static JavaType getJavaType(Class<?> objectClass, Class<?>... elementClasses) {
        return defaultMapper.getTypeFactory().constructParametricType(objectClass, elementClasses);
    }

    public static JsonNode readTree(InputStream in) {
        JsonNode node = NullNode.getInstance();
        try {
            node = defaultMapper.readTree(in);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return node;
    }

    private static ObjectMapper getFromMap(DateFormat key) {
        ObjectMapper om = dateFormatMappers.get(key);
        if (om == null) {
            om = new ObjectMapper();
            om.setDateFormat(key);

            om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            // 配置为true表示mapper接受只有一个元素的数组的反序列化
            om.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            // mapper在遇到mapper对象中存在json对象中没有的数据变量时不报错，可以进行反序列化
            om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            dateFormatMappers.put(key, om);
        }

        return om;
    }

    public static boolean isJson(String json) {

        try {
            json2Object(json, Object.class);
            return true;
        } catch (RuntimeException e) {
            logger.error("不是json格式的字符串：" + json);
            return false;
        }
    }

    public static <T> String map2Json(Map<String, T> map) {
        return object2Json(map);
    }

}
