package org.exmaple.practice.proxy;

/**
 * @Author xiehongsong
 * @Date 2022/7/26
 */
public class ClassAImpl implements ClassA{
    public void executeA() {
        System.out.println("执行a方法");
    }

    public boolean executeB() {
        System.out.println("执行b方法");
        return true;
    }
}
