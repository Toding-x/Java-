package practise.Service;

import practise.entity.Student;

import java.util.List;

public interface StudentServic {

    void StudentAdd(Student student);

    boolean StudentRemove(int id);

    void Studentsort();

    List<Student> StudentGet();
}
