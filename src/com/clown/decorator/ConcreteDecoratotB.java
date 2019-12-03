package com.clown.decorator;

public class ConcreteDecoratotB extends Decortor {

    public ConcreteDecoratotB(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        this.doAnotherThing();
    }

    public void doAnotherThing(){
        System.out.println("功能C");
    }
}
