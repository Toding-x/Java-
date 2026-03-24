package Demo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 {
    public  static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("输入单词");
        System.out.println("输入'end'结束");
    do {
        str = br.readLine();
        System.out.println(str);
    }while (!str.equals("end"));
    }
}
