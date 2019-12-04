package com.clown.linstener;


/**
 * 具体的观察者角色
 *
 *
 * 每个具体的观察者的行为都是由自己实现的
 */
public class ConcreteObserver implements Observer {

    private String name;


    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("observer A receive call back");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
