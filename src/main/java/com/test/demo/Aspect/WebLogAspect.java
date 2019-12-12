package com.test.demo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description: AOP记录日志
 * @author: Mr.Wang
 * @create: 2019-12-11 19:55
 **/
@Aspect
//把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
@Component
public class WebLogAspect {
    private final Logger logger= LoggerFactory.getLogger(WebLogAspect.class);

}
