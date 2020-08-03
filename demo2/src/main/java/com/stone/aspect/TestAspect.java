package com.stone.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MemberSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * create by stone 2020/7/27
 * test BindingResult
 */
@Aspect
@Component
public class TestAspect {
    //定义切点
    @Pointcut("execution(* com.stone.serviceImpl.*.*(..))")
    public void servicePointcut() {}

    @Around("servicePointcut()")
    public Object doAround (ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=================this is @Around================");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();   //获取方法名
        System.out.println("方法名为："+methodName);

        String clazzName = joinPoint.getTarget().getClass().getName();   //获取类名
        System.out.println("类名为："+clazzName);
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("参数名为："+arg.toString());   //获取参数
        }
        Object proceed = joinPoint.proceed();


        return proceed;
    }
}
