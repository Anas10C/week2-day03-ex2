package org.example;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class messageAdvice implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = methodInvocation.proceed();
        long time = System.currentTimeMillis() - start;
        System.out.println("Executed in: " + time + "ms");
        return proceed;
    }
}
