package org.exmaple.practice;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xiehongsong
 * @Date 2022/7/19
 */
public class MainApplication {
    public static void main(String[] args) {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
//            TestDTO d = new TestDTO();
//            TestDTO child = new TestDTO();
//            child.setName("xxxx");
//            d.setChild(child);
//            TestDTO dto = mapper.query3(Arrays.asList("xxx"));
//            TestDTO dto = mapper.query5(new TestQo("xxx"));
//            mapper.query("xxx");
            List<TestDTO> t = mapper.query2(Arrays.asList("xxx"));
            List<TestDTO> t2 = mapper.query2(Arrays.asList("sss"));

            System.out.println(t.get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
