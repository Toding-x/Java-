package practise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentServiceTest {
    private StudentService studentService;
    private Student[] students;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
        students= new Student[]{
                new Student("张三", 18, 85.5),
                new Student("李四", 19, 92.0),
                new Student("王五", 18, 78.5)
        };
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void scoreSum() {
        double result = studentService.ScoreSum(students);
        assertEquals(256.0,result,0.001);
    }

    @Test
    void scoreAverage() {
        double result = studentService.ScoreAverage(students);
        assertEquals(85.333, result, 0.001);
    }

    @Test
    void scoreMax() {
        double result = studentService.ScoreMax(students);
        assertEquals(92.0, result, 0.001);
    }
}