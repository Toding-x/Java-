package practise.service.imp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practise.entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImpTest {
    StudentServiceImp imp = new StudentServiceImp();

    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void studentMap() {
        imp.studentMap(new Student(1,"吴成杰"));
        imp.studentMap(new Student(2,"吴文杰"));
        imp.studentMap(new Student(3,"吴宇杰"));
        imp.studentMap(new Student(4,"吴观杰"));
        imp.studentMap(new Student(5,"吴舒杰"));
        imp.studentMap(new Student(6,"吴昊杰"));

    }
}