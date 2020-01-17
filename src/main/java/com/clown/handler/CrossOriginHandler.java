package com.clown.handler;

public class CrossOriginHandler extends Handler {

    @Override
    public void service() {
        System.out.println("第一步处理全局跨域请求");
        invokeNext();
    }
}
