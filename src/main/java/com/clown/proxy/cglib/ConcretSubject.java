package com.clown.proxy.cglib;

/**
 * 具体主题角色
 *
 *
 * 因为Cglib的代理类是基于具体角色的而创建他的子类
 * 既代理类是主题角色的子类
 */
public class ConcretSubject {
    public void mainTask(){
        System.out.println(" this is subject task");
    }
}
