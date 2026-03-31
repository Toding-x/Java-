package practise.Service;

import practise.entity.Student;

public interface StudentServic {
    void StudentAdd(Student student);

    void StudentRemove(int id);

    void Studentsort();
    void StudentGet();
}
