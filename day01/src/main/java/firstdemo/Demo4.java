package firstdemo;

public class Demo4 {
    private static int numsInstance;
    protected static int getConunt(){
        return numsInstance;
    }
    private static void addInstance(){
        numsInstance++;
    }
     Demo4(){
        Demo4.addInstance();
    }
    public static void main(String[] arguments){
        System.out.println("starting with"+Demo4.getConunt()+"instance");
        for (int i = 0; i < 500; i++){
            new Demo4();
        }
        System.out.println("Create"+Demo4.getConunt()+"instance");
    }
}
