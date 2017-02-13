package com.aiyacloud.common;

import java.lang.reflect.Type;

/**
 * Created by hx on 2016/2/16.
 */
public class RedisKey {


    public static enum KeyType {
        ;

        Type type;
        String value;

        KeyType(String value) {
            this.value = value;
        }

        KeyType(String value, Type type) {
            this.value = value;
            this.type = type;
        }


        public String getKey() {
            return value;
        }

        public String getKey(String str) {
            return value + str;
        }

        public Type getType() {
            return type;
        }

    }
}
