package practise;

public class Teacher extends  Person{
    private String course;

    public Teacher(String name, boolean sex) {
        super(name, sex);
        this.course = course;
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
