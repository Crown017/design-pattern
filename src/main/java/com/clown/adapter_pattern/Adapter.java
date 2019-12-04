package com.clown.adapter_pattern;


/**
 * 适配器角色
 *
 * 将源角色的行为 替换成被目标的行为
 * 适配器继承哪个类就对哪个类适配
 */
public class Adapter extends Adaptee implements Target {



    @Override
    public void request() {
        super.doSomething();
    }
}
