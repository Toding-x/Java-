package practise.entity;

public class Person {
    private String name;
    private int age;
    private String Classroom;
    private boolean sex;
    private int id;

    public Person(){}

    public Person(String name, int age, String classroom, boolean sex,int id) {
        this.name = name;
        this.age = age;
        this.Classroom = classroom;
        this.sex = sex;
        this.id =id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassroom() {
        return Classroom;
    }

    public void setClassroom(String classroom) {
        Classroom = classroom;
    }

    public String getSex() {
        if (sex) {
            return "男";
        } else {
            return "女";
        }
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Classroom='" + Classroom + '\'' +
                ", sex=" + sex +
                ", id=" + id +
                '}';
    }
}
