package com.imooc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Created by heitizi on 2017/3/30.
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.imooc.Controller.GirlController.girlList(..))")
    public void log() {

    }

    @Before("log()")
    public void before() {
        System.out.println(1111111111);
        logger.info("1212121");
    }

    @After("log()")
    public void doAfter() {
        System.out.println(1111111111);
        logger.info("343434");
    }
}
