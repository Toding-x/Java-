import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private Student[] student;

    public  StudentService(Student [] student)  {
        this.student = student;
    }
    public void getHighScoreStudents(double minScore) {
        List <Student> students = new ArrayList<Student>();
        for (int i = 0; i < student.length; i++) {
            if (student [i].getScore() >=minScore) {
                students.add(student[i]);
            }

        }
        System.out.println(students);
    }
    public void getRankFirst() {
        Student top = student[0];
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < student.length; i++) {
            if (student[i].getScore() >top.getScore() ) {
                top = student[i];
            }
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i].getScore() == top.getScore()) {
                students.add(student[i]);
            }
        }
        System.out.println(students);
    }
}
