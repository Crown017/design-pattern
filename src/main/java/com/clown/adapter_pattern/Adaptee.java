package com.clown.adapter_pattern;

/**
 *
 * 源角色
 *
 * 就是要通过适配器转化成目标角色的
 */
public class Adaptee {
    public void doSomething(){
        System.out.println("I'm kind of busy,leave me alone,pls!");
    }
}
