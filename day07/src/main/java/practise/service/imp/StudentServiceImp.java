package practise.service.imp;

import practise.entity.Student;
import practise.service.StudentService;

import java.util.HashMap;

public class StudentServiceImp implements StudentService {
    HashMap<Integer,Student> map = new HashMap<Integer, Student>();
    @Override
    public void studentMap(Student student){
        map.put(student.getId(),student);
        map.get(student.getId());

        for (Integer id : map.keySet() ){
            Student S =map.get(id);
            System.out.println(S);
        }
    }
}

