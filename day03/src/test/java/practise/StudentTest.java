package practise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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

        // 这里只是调用方法，没有检查结果，测试作用会比较弱。
        student.checkDate();
        Assertions.assertEquals(37,student.getId());
        Assertions.assertEquals("3班",student.getClassroom());
    }
}