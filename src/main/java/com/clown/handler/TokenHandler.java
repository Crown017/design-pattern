package com.clown.handler;

public class TokenHandler extends Handler {

    @Override
    public void service() {
        System.out.println("第二步，处理Token验证");
        invokeNext();
    }
}
