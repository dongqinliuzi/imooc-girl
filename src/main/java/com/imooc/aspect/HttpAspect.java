package com.imooc.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by heitizi on 2017/3/30.
 */
@Aspect
@Component
public class HttpAspect {

    @Before("execution(public * com.imooc.Controller.GirlController.girlList(..))")
    public void log() {
        System.out.println(1111111111);
    }

    @After("execution(public * com.imooc.Controller.GirlController.girlList(..))")
    public void doAfter() {
        System.out.println(1111111111);
    }
}
