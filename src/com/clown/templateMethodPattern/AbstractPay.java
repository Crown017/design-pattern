package com.clown.templateMethodPattern;

public abstract class AbstractPay  implements PayBuy{

    //模板方法
    @Override
    public abstract void pay();

    @Override
    public void countDownDb() {
        System.out.println("开始减库存");
    }
}
