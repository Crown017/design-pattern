package com.clown.decorator;

/**
 * 具体的组件
 */
public class ConcreteCompotent implements Component {
    @Override
    public void doSomething() {
        System.out.println("功能A");
    }
}
