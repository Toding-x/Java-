package practise.entity;

public class Dog extends Animal{
    private String address;

    public Dog(String name,String eat,String food,String address){
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
