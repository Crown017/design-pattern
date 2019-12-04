package com.clown.linstener;


/**
 * 抽象被观察者角色
 *
 * 可以添加观察者
 * 删除观察者
 */
public interface Subject {
    void doSomething();
    void addObserver(Observer observer);
    void deleteObserver(String name);
}
