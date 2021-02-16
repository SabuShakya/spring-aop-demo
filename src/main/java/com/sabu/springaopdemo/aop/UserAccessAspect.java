package com.sabu.springaopdemo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class UserAccessAspect {

    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
    @Before("execution(* com.sabu.springaopdemo.data.*.*(..))")
    public void before(JoinPoint joinPoint){
        log.info("Check for user access");
        log.info("Allowed for execution for {}",joinPoint);
    }
}
