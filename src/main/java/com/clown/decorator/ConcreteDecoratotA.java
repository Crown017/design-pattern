package com.clown.decorator;

public class ConcreteDecoratotA extends Decortor {

    public ConcreteDecoratotA(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        this.doAnotherThing();
    }

    public void doAnotherThing(){
        System.out.println("功能B");
    }
}
