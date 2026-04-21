import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

class Title05Test {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {


    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test
    void sort() {
        List<Student> list=new ArrayList<>();
        list.add(new Student("张三", 85));
        list.add(new Student("李四", 92));
        list.add(new Student("王五", 78));
        list.add(new Student("赵六", 96));
        Title05 title05 = new Title05();
        title05.sort(list);
        Assertions.assertEquals(96,list.get(0).getScore());
    }

    @org.junit.jupiter.api.Test
    void findMax() {
        List<Student> list=new ArrayList<>();
        list.add(new Student("张三", 85));
        list.add(new Student("李四", 92));
        list.add(new Student("王五", 78));
        list.add(new Student("赵六", 96));
        Title05 title05 = new Title05();
        title05.findMax(list);
        Assertions.assertEquals("赵六",title05.findMax(list).get(0).getName());
    }

    @org.junit.jupiter.api.Test
    void findScore() {
        List<Student> list=new ArrayList<>();
        list.add(new Student("张三", 85));
        list.add(new Student("李四", 92));
        list.add(new Student("王五", 78));
        list.add(new Student("赵六", 96));
        Title05 title05 = new Title05();
        Assertions.assertEquals(2,title05.findScore(list).size());
        List<String> name = title05.findScore(list).stream().map(Student::getName).toList();
        Assertions.assertTrue(name.contains("李四"));
        Assertions.assertTrue(name.contains("赵六"));
        Assertions.assertTrue(title05.findMax(list).stream().allMatch(student -> student.getScore()>=90));

    }
}