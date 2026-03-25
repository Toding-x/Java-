package practise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    @BeforeEach
    void setUp() {
        student = new Student("小吴",true,"学生",37,"3班");
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试时结束");
    }

    @Test
    void checkDate() {
        student.checkDate();
    }
}