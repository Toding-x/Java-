package firstdemo;

public class RunoobTest {
    private int instanceVar;
    public static int staticVar;

    public void  menthod(int parameter){
        int localVar=10;

        instanceVar = localVar;
        staticVar = instanceVar;
        staticVar =parameter;

        System.out.println("成员变量"+instanceVar);
        System.out.println("静态变量"+staticVar);
        System.out.println("参数变量"+parameter);
        System.out.println("局部变量"+localVar);
    }

    public static void main(String[] args){
        RunoobTest test = new RunoobTest();
        test.menthod(20);
    }
}
