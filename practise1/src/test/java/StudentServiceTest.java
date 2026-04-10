import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    Student []arr = {
            new Student("张三", 85),
            new Student("李四", 92),
            new Student("假李四", 92),
            new Student("王五", 76)
    };
    StudentService studentservice = new StudentService(arr);

    @Test
    void getHighScoreStudents() {
        studentservice.getHighScoreStudents(80);
    }

    @Test
    void getRankFirst() {
        studentservice.getRankFirst();
    }
}