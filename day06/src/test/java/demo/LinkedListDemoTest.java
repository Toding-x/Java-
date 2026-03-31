package demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListDemoTest {
    private LinkedListDemo demo;

    @BeforeEach
    void setUp() {
        demo = new LinkedListDemo();
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void listAdd() {
        demo.ListAdd();
        assertEquals("纯",demo.list.getLast());

    }

    @Test
    void listRemove() {
        demo.ListRemove();
        assertEquals("成",demo.list.getLast());
    }

    @Test
    void listGet() {
        demo.ListGet();
        assertEquals("吴",demo.list.getFirst());
        assertEquals("杰",demo.list.getLast());
    }

    @Test
    void listTraverse() {
        assertDoesNotThrow(()->{
            demo.ListTraverse();
        });
    }
}