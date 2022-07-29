package org.exmaple.practice.proxy;

/**
 * @Author xiehongsong
 * @Date 2022/7/26
 */
public class ClassAWrapper implements ClassA{
    private ClassA a;

    public ClassAWrapper(ClassA a) {
        this.a = a;
    }

    @Override
    public void executeA() {
        System.out.println("执行包装器方法a");
        a.executeA();
    }

    @Override
    public boolean executeB() {
        System.out.println("执行包装器方法b");
        return a.executeB();
    }
}
