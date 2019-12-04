package com.clown.decorator.pattern;

public class DecoratorTest{
    public static void main(String[] args) {
        /**
         * 具体组件被装饰器A所装饰。 A又被B 装饰
         *
         * 组件就有了B的功能
         */


        Component component = new ConcreteDecoratotB(new ConcreteDecoratotA(
                new ConcreteCompotent()));

        component.doSomething();    }
}