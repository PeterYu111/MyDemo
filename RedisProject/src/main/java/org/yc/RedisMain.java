package org.yc;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

public class RedisMain {


    public static void main(String[] args) {
        JedisPool pool = new JedisPool("127.0.0.1", 6379);

        try (Jedis jedis = pool.getResource()) {
            // Store & Retrieve a simple string

//            strings 使用begin
            jedis.incr("loginCount");
            jedis.incr("loginCount");
            jedis.incr("loginCount");
            jedis.incr("loginCount");

            jedis.set("name","yc");
            jedis.setnx("name","chong");

            System.out.printf(jedis.get("loginCount"));
            System.out.printf(jedis.get("name"));
            //strings 使用end

            //Lists begin

            jedis.lpush("myList","1");
            jedis.lpush("myList","2");
            String pop=jedis.lpop("myList");

            System.out.printf("pop:"+pop);

            //Lists end

        }
    }
}
