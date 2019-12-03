package com.clown.templateMethodPattern;

public class AliPay extends AbstractPay {
    @Override
    public void pay() {
        System.out.println("ALiPay 开始执行....");
    }
}
