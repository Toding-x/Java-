package Demo;

public class Penguin extends Animal{
    public Penguin(String name, int id){
        super(name, id);
    }
    public static void main(String []args){
        Penguin penguin = new Penguin("企鹅",12);
        penguin.eat();
        penguin.sleep();
        penguin.introduction();

    }
}
