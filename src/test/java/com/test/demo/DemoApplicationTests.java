package com.test.demo;

import com.test.demo.config.RedisUtil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@SpringBootTest
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void redistest(){
        RedisUtil redisUtil=new RedisUtil();
        redisUtil.set("java1","test");
    }
}
