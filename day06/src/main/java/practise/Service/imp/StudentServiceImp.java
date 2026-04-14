package practise.Service.imp;

import practise.Service.StudentServic;
import practise.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class StudentServiceImp implements StudentServic {

    ArrayList<Student> list = new ArrayList<>();
    @Override
    public void StudentAdd(Student student) {

        list.add(student);

    }

    @Override
    public void StudentRemove(int id) {
        Iterator <Student> ito= list.iterator();
        while (ito.hasNext()){
            Student student = ito.next();
            if (id == student.getId()){
                ito.remove();
            }
        }
    }

    @Override
    public void Studentsort() {
        list.sort(Comparator.comparingDouble(Student::getScore).reversed());
    }

    @Override
    public void StudentGet() {
        System.out.println(list);

    }
}
