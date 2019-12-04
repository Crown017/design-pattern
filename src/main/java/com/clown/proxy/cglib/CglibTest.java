package com.clown.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        CglibProxy<ConcretSubject> callback = new CglibProxy<>();
        enhancer.setCallback(callback);
        enhancer.setSuperclass(ConcretSubject.class);
        ConcretSubject concretSubject1 = (ConcretSubject) enhancer.create();
        concretSubject1.mainTask();
    }
}
