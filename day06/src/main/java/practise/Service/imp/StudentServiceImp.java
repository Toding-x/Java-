package practise.Service.imp;

import practise.Service.StudentServic;
import practise.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentServiceImp implements StudentServic {

    // 建议：成员变量最好写成 private，先把封装意识养起来，后面类会更好维护。
    // 给你的练习任务：
    // 1. 先把这里改成 private。
    // 2. 再往前走一步：左边类型能不能写成 List<Student>？
    /*
    面向接口编程，因为ArrayList是继承list，是list的实现类，左边换成list可以不需要修改，如果后面实现类换成LinkList不需要修改List，Map同理
     */
    // 3. 想一想：为什么“面向接口编程”这个词，总是和可维护性一起出现？
    // TODO（优先级2）：把这里收口成 private，并思考左边能不能改成 List<Student>。
    List<Student> list = new ArrayList<>();
//    private ArrayList<Student> list = new ArrayList<>();
    @Override
    public void StudentAdd(Student student) {
        for(Student s : list){
            if (s.getId() == student.getId()){
                throw new IllegalArgumentException("学生id已经存在"+student.getId());
            }
        }

        // 给你的练习任务：如果两个学生 id 一样，现在这段代码会怎样？
        // 再想一想：新增之前要不要先校验“学号是否已存在”？

        list.add(student);

    }

    @Override
    public boolean StudentRemove(int id) {
        Iterator <Student> ito= list.iterator();

        while (ito.hasNext()){
            Student student = ito.next();
            if (id == student.getId()){
                ito.remove();
                return true;
                // 如果学号唯一，这里删完就可以 break，能少走一段循环。
                // 给你的练习任务：试着让删除方法返回 boolean，调用方就能知道“到底删没删到”。
            }
        }
        throw new IllegalArgumentException(id+"不存在");
    }

    @Override
    public void Studentsort() {
        // 这里用方法引用 + reversed() 很不错，说明你已经开始接触更简洁的写法了。
        list.sort(Comparator.comparingDouble(Student::getScore).reversed());
    }

    @Override
    public List<Student> StudentGet() {
        // 建议：Service 层更推荐“返回数据”，少直接打印。
        // 现在是练习项目没问题，但以后接控制层、页面层时会更自然。
        // 给你的练习任务：把这个方法改成返回 List<Student>，然后再想想测试会不会更好写。
        return list;

    }
}




