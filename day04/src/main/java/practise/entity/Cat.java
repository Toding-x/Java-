package practise.entity;

public class Cat extends Animal{
    private String master;

    public Cat(String name,String move,String food,String master){
        // 这里把 eat、move 这样传上去，动作和食物的意思容易看混。
        super(name,move,food);//修改了，动作统一move
        this.master=master;
    }

    public Cat() {
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "master='" + master + '\'' +
                '}';
    }
}