package com.clown.proxy.jdk;

/**
 * 具体主题角色
 */
public class ConcretSubject implements Subject{
    public void mainTask(){
        System.out.println(" this is subject task");
    }
}
