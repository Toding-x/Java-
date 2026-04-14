package practise.Service.imp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practise.entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImpTest {
    Student s1 = new Student(60.0,"吴成杰","22软3",false,22,37);
    Student s2 = new Student(99.9,"吴能杰","22软3",true,23,38);
    Student s3 = new Student(100.0,"吴有杰","22软3",true,22,73);

    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        // 小建议：这里文案更适合写“结束测试”，日志一眼就能看懂执行阶段。
        System.out.println("开始测试");
    }

    @Test
    void StudentAdd() {
        StudentServiceImp service = new StudentServiceImp();
        service.StudentAdd(s1);
        service.StudentAdd(s2);
        service.StudentAdd(s3);
        assertEquals(3,service.list.size());
    }

    @Test
    void StudentRemove() {
        StudentServiceImp service = new StudentServiceImp();
        service.StudentAdd(s1);
        service.StudentAdd(s2);
        service.StudentAdd(s3);
        service.StudentRemove(s2.getId());
        assertEquals(2,service.list.size());

    }

    @Test
    void StudentSort() {
        StudentServiceImp service = new StudentServiceImp();
        service.StudentAdd(s1);
        service.StudentAdd(s2);
        service.StudentAdd(s3);
        service.Studentsort();
        // 建议：测试里尽量多写断言，少只打印。
        // 比如这里可以断言排序后第一个学生的分数是不是 100.0，这样测试才真正能兜底。
        System.out.println(service.list);

    }

    @Test
    void tudentGet() {
        // 小建议：测试方法名有个单词少了 S，虽然不影响运行，但命名整齐会让测试报告更舒服。
        StudentServiceImp service = new StudentServiceImp();
        service.StudentAdd(s1);
        service.StudentAdd(s2);
        service.StudentAdd(s3);
        service.StudentGet();


    }
}
