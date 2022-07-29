package org.exmaple.practice;

/**
 * @Author xiehongsong
 * @Date 2022/7/19
 */
public class TestDTO {
    private Long id;
    private String name;
    private TestDTO child;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestDTO getChild() {
        return child;
    }

    public void setChild(TestDTO child) {
        this.child = child;
    }
}
