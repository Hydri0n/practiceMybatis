package org.exmaple.practice;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author xiehongsong
 * @Date 2022/7/19
 */
public interface TestMapper {
    TestDTO query(String name);


    List<TestDTO> query2( List<String> names);

    TestDTO query3(@Param("names") List<String> names);

    TestDTO query4(TestDTO d);

    TestDTO query5(TestQo q);
}
