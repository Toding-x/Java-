package firstdemo;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("接受的方式是：");
//         if(sc.hasNext()){
//             String str = sc.next();
//             System.out.println("输出的数据为"+str);
//
//         }
//         sc.close();
// next使用
        if(sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println("输入的数据"+str);
        }
        sc.close();
    }
}
