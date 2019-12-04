package com.clown.linstener;

public class ObserverTest {
    public static void main(String[] args) {
        ConcreteObserver concreteObserverA = new ConcreteObserver("A");
        ConcreteObserverB concreteObserverB = new ConcreteObserverB("B");

        ConcreteSubject concreteSubject =new ConcreteSubject();
        concreteSubject.addObserver(concreteObserverA);
        concreteSubject.addObserver(concreteObserverB);
        concreteSubject.doSomething();
    }
}
