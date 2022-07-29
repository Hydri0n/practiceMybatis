package org.exmaple.practice.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author xiehongsong
 * @Date 2022/7/26
 */
public class DynamicProxyA implements InvocationHandler {

    public ClassA a;

    public DynamicProxyA(ClassA a) {
        this.a = a;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理方法执行中");
        if ("executeA".equals(method.getName())) {
            System.out.println("执行代理方法a");
        } else if ("executeB".equals(method.getName())) {
            System.out.println("执行代理方法b");
        }
        return method.invoke(a, args);
    }
}
