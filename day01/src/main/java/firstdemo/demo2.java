package firstdemo;

public class demo2 {
    private String name;
    private int age;

    public demo2(String name){
        this.name = name;
        System.out.println("动物名字是：" + name);
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        demo2 dog =new demo2("小狗");
        dog.setAge(10);
        int age = dog.getAge();
        System.out.println("年龄：" + age);
        System.out.println("小狗的年龄是：" + dog.getAge());
    }
}
