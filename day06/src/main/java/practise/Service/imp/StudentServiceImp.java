package practise.Service.imp;

import practise.Service.StudentServic;
import practise.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class StudentServiceImp implements StudentServic {

    // 建议：成员变量最好写成 private，先把封装意识养起来，后面类会更好维护。
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
                // 如果学号唯一，这里删完就可以 break，能少走一段循环。
            }
        }
    }

    @Override
    public void Studentsort() {
        // 这里用方法引用 + reversed() 很不错，说明你已经开始接触更简洁的写法了。
        list.sort(Comparator.comparingDouble(Student::getScore).reversed());
    }

    @Override
    public void StudentGet() {
        // 建议：Service 层更推荐“返回数据”，少直接打印。
        // 现在是练习项目没问题，但以后接控制层、页面层时会更自然。
        System.out.println(list);

    }
}
