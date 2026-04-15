package practise.Service.imp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practise.entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImpTest {
    // 给你的练习任务：
    // 1. 每个测试尽量至少有一个断言，不要只靠 println 判断对错。
    // 2. 排序测试要验证顺序，删除测试要验证删掉的是不是目标对象。
    // 3. 想一想：如果测试只打印不校验，和手工运行程序看结果有什么本质区别？
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
        // 给你的练习任务：把这里改掉，然后顺手观察一下测试生命周期方法是不是按预期执行。
        System.out.println("结束测试");
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
        // TODO（优先级1）：把这个测试从“打印看看”改成“断言验证”。
        // 完成标准：至少断言第 1 名和第 2 名的分数，测试失败时能自动报错。
        StudentServiceImp service = new StudentServiceImp();
        service.StudentAdd(s1);
        service.StudentAdd(s2);
        service.StudentAdd(s3);
        service.Studentsort();
        // 建议：测试里尽量多写断言，少只打印。
        Assertions.assertEquals(100,service.list.get(0).getScore());
        Assertions.assertEquals(99.9,service.list.get(1).getScore());

        // 比如这里可以断言排序后第一个学生的分数是不是 100.0，这样测试才真正能兜底。
        // 给你的练习任务：补上 assertEquals(100.0, ...)，再补一个断言验证第二名是不是 99.9。
        System.out.println(service.list);

    }

    @Test
    void StudentGet() {
        // TODO（优先级3）：等 StudentGet 改成返回数据后，把这个测试也补成断言版。
        // 小建议：测试方法名有个单词少了 S，虽然不影响运行，但命名整齐会让测试报告更舒服。
        // 想一想：如果 StudentGet 以后改成“返回数据”，这个测试是不是就能从“打印观察”升级成“断言验证”？
        StudentServiceImp service = new StudentServiceImp();
        service.StudentAdd(s1);
        service.StudentAdd(s2);
        service.StudentAdd(s3);
        service.StudentGet();
        Assertions.assertEquals(37,service.list.get(0).getId());
        Assertions.assertEquals(60,service.list.get(0).getScore());


    }
}




