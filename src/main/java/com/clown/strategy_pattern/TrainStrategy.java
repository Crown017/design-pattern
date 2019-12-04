package com.clown.strategy_pattern;

/**
 * 具体的策略角色
 */
public class TrainStrategy implements Strategy{

    @Override
    public void goHome() {
        System.out.println("火车回家 需要 8 小时");
    }
}
