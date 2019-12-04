package com.clown.proxy.jdk;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),new Class[]{Subject.class},new ProxyFactory(new ConcretSubject()));
        subject.mainTask();
    }
}
