package practise.entity;

public class Dog extends Animal{
    private String address;

    public Dog(String name,String eat,String food,String address){
        // 这里把 eat 传给了父类第二个参数，名字容易让人看混。
        super(name,eat,food);
        this.address = address;
    }

    public Dog(){

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "address='" + address + '\'' +
                '}';
    }
}