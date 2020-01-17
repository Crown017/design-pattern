package com.clown.handler;

public class AuthHandler extends Handler {

    @Override
    public void service() {
        System.out.println("第三步，处理权限判断");
        invokeNext();
    }
}
