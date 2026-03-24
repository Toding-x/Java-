package Demo;


     class AnimalTest {
        public void move(){
            System.out.println("动物可以移动");
        }
    }
     class Dog extends AnimalTest{
        public void move(){
            System.out.println("狗可以唱跳rap");
        }
    }
    public class DogTest {
         public static void main(String[]args){
             AnimalTest a = new AnimalTest();
             AnimalTest b = new Dog();

             a.move();
             b.move();
         }
}




