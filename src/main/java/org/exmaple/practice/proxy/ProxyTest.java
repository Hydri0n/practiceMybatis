package org.exmaple.practice.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author xiehongsong
 * @Date 2022/7/26
 */
public class ProxyTest {
    @Test
    public void testProxy() {
        ClassA realA = new ClassAImpl();
        InvocationHandler proxy = new DynamicProxyA(realA);
        ClassA a = (ClassA) Proxy.newProxyInstance(ClassA.class.getClassLoader(), new Class[]{ClassA.class}, proxy);
        a.executeA();
        System.out.println(a.executeB());
    }

    @Test
    public void testWrapper() {
        ClassA realA = new ClassAImpl();
        ClassA wrapper = new ClassAWrapper(realA);
        wrapper.executeA();
        System.out.println(wrapper.executeB());
    }
}
