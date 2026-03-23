package firstdemo;

public class Demo3 {
    public String name;
    private double salary;
     public Demo3(String name1  ){
         name=name1;
     }
     public void setSalary(double salary1){
         salary=salary1;
     }
     public void print(){
         System.out.println("名字"+name);
         System.out.println("薪资"+salary);
     }

     public static  void main( String[] args){
         Demo3 demo3 = new Demo3("小王");
         demo3.setSalary(5000);
         demo3.print();
     }
}
