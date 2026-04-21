public class Title02 {

     public static void divide(int a,int b){
        if (b==0){
            throw new RuntimeException("除数不能为0，a=" + a);
        }else {
            System.out.println("结果是"+(a/b));

        }
    }
    public static void main(String[] args) {
        try {
            divide(10,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


