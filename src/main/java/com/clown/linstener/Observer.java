package com.clown.linstener;

/**
 * 抽象观察者角色
 *
 * 当事件发生时 观察者收到通知调用回调函数
 */
public interface Observer {
    void callback();
    String getName();
}
