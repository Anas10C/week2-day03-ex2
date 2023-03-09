package org.example;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Messenger msg = new Messenger();
        AnnotationMatchingPointcut pc = AnnotationMatchingPointcut.forMethodAnnotation(TimeIt.class);
        Advisor advisor = new DefaultPointcutAdvisor(pc, new messageAdvice());
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(msg);
        pf.addAdvisor(advisor);
        Messenger proxy = (Messenger) pf.getProxy();
        proxy.sendMessage();
        proxy.retrieveMessage();
    }
}