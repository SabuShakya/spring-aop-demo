package com.sabu.springaopdemo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class AfterAopAspect {

    @AfterReturning(value = "execution(* com.sabu.springaopdemo.business.*.*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("{} returned with value {}", joinPoint, result);
    }

    @After(value = "execution(* com.sabu.springaopdemo.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        log.info("after execution of {}", joinPoint);
    }

    // Advice -> What? Before after
    // Pointcut Where ?
    @Around(value = "execution(public void testSomething())")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("The method aroundAdvice() before invokation of the method "
                + joinPoint.getSignature().getName() + " method");
        Object proceed=null;
        try {
           proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("The method aroundAdvice() after invokation of the method "
                + joinPoint.getSignature().getName() + " method");
        return proceed;
    }

}
