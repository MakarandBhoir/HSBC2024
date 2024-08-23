package com.hsbc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerService {
//    @Before("execution(* com.hsbc.service.HelloService.sayHello(..))")
//    public void logBefore(){
//        System.out.println("Before advice is called.");
//    }
//    public void logAfter(){
//        System.out.println("After advice is called.");
//    }
    @Around("execution(* com.hsbc.service.HelloService.sayHello(..))")
    public String logAround(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Before - Around advice is called.");
        String result = (String) jp.proceed();
        System.out.println("After - Around advice is called.");
        return result;
    }
    @Around("execution(* com.hsbc.service.HelloService.sayHello2(..))")
    public void logAround2(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Before - Around advice is called.");
        jp.proceed();
        System.out.println("After - Around advice is called.");
    }
}
