package com.clown.strategy_pattern;

/**
 * 具体的策略角色
 *
 * 策略的具体实现
 */
public class FlyStrategy implements Strategy {
    @Override
    public void goHome() {
        System.out.println("坐飞机到花了3小时");
    }
}
