package practise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentServiceTest {

    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void scoreSum() {
        StudentService sum = new StudentService();
        assertEquals(99,sum.ScoreSum());
    }

    @Test
    void scoreAverage() {
    }

    @Test
    void scoreMax() {
    }
}