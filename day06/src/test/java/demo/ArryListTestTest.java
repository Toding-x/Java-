package demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class ArryListTestTest {
    ArryListTest test = new ArryListTest();
    ArrayList<String> list = new ArrayList<>(){{
     add("吴");
     add("成");
     add("杰");

    }};

    @BeforeEach
    void setUp() {
        System.out.println("测试开始");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void raverse() {
        test.raverse(list);

    }

    @Test
    void reverse1() {
        test.reverse1(list);
    }

    @Test
    void reverse2() {
        test.reverse2(list);
    }
}