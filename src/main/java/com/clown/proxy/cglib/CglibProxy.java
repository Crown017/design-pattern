package com.clown.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 辅助类必须继承MethodInterceptor接口
 *
 * 继承了这个接口的类在Cglib 中叫做Callable
 * @param <T>
 */
public class CglibProxy<T> implements MethodInterceptor {

    /**
     *
     * @param o  代理类 功能的实现是由代理对象调用代理方法
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = methodProxy.invokeSuper(o,objects);
        return result;
    }
}
