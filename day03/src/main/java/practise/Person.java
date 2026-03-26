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

    // 这里把 true/false 直接变成“男/女”，会把数据和显示混在一起。
    // 更清楚的做法是先保留原始值，显示时再转中文。
    public String getSex() {
        if (sex){
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

    // checkDate 这个名字像“检查日期”，不太符合方法实际作用。
    // 这个方法其实是在输出人物信息。
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