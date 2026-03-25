package practise;

public abstract class Person {
    private String name;
    private boolean sex;
    private String work;
    public Person(String name,boolean sex,String work){
        this.name=name;
        this.sex=sex;
        this.work=work;
    }

    public String getSex() {
        if (sex==true){
            return "男";
        }else {
            return  "女";
        }
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void checkDate();

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", work='" + work + '\'' +
                '}';
    }
}
