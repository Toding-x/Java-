package practise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    Teacher teacher;
    @BeforeEach
    void setUp() {
        teacher = new Teacher("张三",true,"老师","语文");
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试时结束");
    }

    @Test
    void checkDate() {

        teacher.checkDate();

    }
}