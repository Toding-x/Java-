package practise;

public class Teacher extends  Person{
    private String course;

    public Teacher(String name,boolean sex,String work,String course){
        super(name,sex,work);
        setCourse(course);
    }

    @Override
    public void checkDate() {
        System.out.println(getName()+"是教"+course+"的"+getSex()+getWork());
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "course='" + course + '\'' +
                '}';
    }
}
