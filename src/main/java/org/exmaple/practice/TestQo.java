package org.exmaple.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiehongsong
 * @Date 2022/7/22
 */
public class TestQo {
    Map<String, String> map;

    public TestQo(String s) {
        map = new HashMap<>();
        map.put("key", s);
    }
}
