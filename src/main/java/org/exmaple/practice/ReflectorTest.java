package org.exmaple.practice;

import org.apache.ibatis.reflection.TypeParameterResolver;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiehongsong
 * @Date 2022/7/20
 */

public class ReflectorTest {

    ClassA<String, Long> a = new ClassA<String, Long>();


    @Test
    public void runTypeResolver() throws NoSuchFieldException {


        Field f1 = a.getClass().getDeclaredField("map");
        Field f2 = ClassA.class.getDeclaredField("map");

        Type type1 = f1.getGenericType();

        Type type2 = f2.getGenericType();

//        Type type3 = TypeParameterResolver.resolveFieldType(f1, type1);

        Type type4 = TypeParameterResolver.resolveFieldType(f2, ReflectorTest.class.getDeclaredField("a").getGenericType());

        ParameterizedType t = (ParameterizedType) type4;
        for (Type tt : t.getActualTypeArguments()) {
            System.out.println(tt.getTypeName());
        }

//        System.out.println(type1.equals(type3));
    }

    class ClassA<K, V> {
        protected Map<K, V> map = new HashMap<K, V>();

        public Map<K, V> getMap() {
            return map;
        }

        public void setMap(Map<K, V> map) {
            this.map = map;
        }
    }

    @Test
    public void testGetParam() throws NoSuchMethodException {
        Method m = TestMapper.class.getDeclaredMethod("query", String.class);
        for (Parameter p : m.getParameters()) {
            System.out.println(p.getName());
        }

    }
}
