package Demo;

public class Mouse extends Animal{
    public Mouse(String name,int id){
        super(name, id);

    }
    public static void main(String []args){
        Mouse mouse = new Mouse("老鼠",22);
        mouse.eat();
        mouse.sleep();
        mouse.introduction();

    }
}
