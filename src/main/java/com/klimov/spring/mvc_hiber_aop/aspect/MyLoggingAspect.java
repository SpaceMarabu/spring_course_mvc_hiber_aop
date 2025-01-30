package com.klimov.spring.mvc_hiber_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.klimov.spring.mvc_hiber_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("Begin of " + methodName);
        Object targetMethodResult = joinPoint.proceed();
        System.out.println("End of " + methodName);

        return targetMethodResult;
    }
}
