package com.clown.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * 代理类的辅助类
 */
public class MyHandler implements InvocationHandler {

    private Subject subject;

    public MyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(subject,args);
        return result;
    }
}
