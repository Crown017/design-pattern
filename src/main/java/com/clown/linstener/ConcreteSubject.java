package com.clown.linstener;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcreteSubject implements Subject {

    /**
     * 持有多个观查者的的引用
     *
     * 在主题对象发生变化时通知每个观察者的
     */
    private Map<String,Observer> capacity = new ConcurrentHashMap<>();


    @Override
    public void addObserver(Observer observer) {
        capacity.put(observer.getName(),observer);
    }

    @Override
    public void deleteObserver(String name) {
        capacity.remove(name);
    }

    @Override
    public void doSomething() {
        System.out.println("I will do something ");
        Set<Map.Entry<String,Observer>> entrySet = capacity.entrySet();
        for (Map.Entry<String,Observer> entry :entrySet){
           Observer observer =  entry.getValue();
           observer.callback();
        }
    }
}
