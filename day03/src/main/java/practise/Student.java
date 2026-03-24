package practise;

public class Student extends Person {
    private int Id;
    private String classroom;
    public  Student(String name,boolean sex,int Id ,String classroom){
        super(name,sex);
        this.Id=Id;
        this.classroom=classroom;

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
