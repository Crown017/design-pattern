package com.clown.strategy_pattern;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new FlyStrategy());
        context.goHome();
    }
}
