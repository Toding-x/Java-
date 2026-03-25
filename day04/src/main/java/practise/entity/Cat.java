package practise.entity;

public class Cat extends Animal{
    private String master;

    public Cat(String name,String eat,String move,String master){
        super(name,eat,move);
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
