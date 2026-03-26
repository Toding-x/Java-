package practise;

public class Student extends Person {
    // 字段名一般写成 id，不建议写成 Id。
    private int Id;
    // 其余的这些字段可以采用“驼峰命名”，比如classRoom
    private String classroom;
    public  Student(String name,boolean sex,String work,int Id ,String classroom){
        super(name,sex,work);
        setId(Id);
        setClassroom(classroom);

    }
    public void checkDate(){
        System.out.println("学号"+Id+"的"+getName()+"是"+classroom+"的"+getSex()+getWork());

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}