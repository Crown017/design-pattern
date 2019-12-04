package com.clown.decorator.pattern;

public class Decortor implements Component {

    /**
     * 装饰一个组件
     */
    private Component component;

    public Decortor(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        component.doSomething();
    }
}
