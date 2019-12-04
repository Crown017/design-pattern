package com.clown.linstener;

public class ConcreteObserverB implements Observer {

    private String name;


    public ConcreteObserverB(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("observer B receive call back");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
