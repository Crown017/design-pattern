package com.clown.strategy_pattern;

/**
 * Context封装角色
 *
 * 对于调用者只要将具体的策略去交给上下文
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void goHome(){
        strategy.goHome();
    }

}
