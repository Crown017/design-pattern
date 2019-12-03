package com.clown.templateMethodPattern;

public class WeixinPay extends AbstractPay {
    @Override
    public void pay() {
        System.out.println(" 微信支付 开始支付。。。。");
    }
}
