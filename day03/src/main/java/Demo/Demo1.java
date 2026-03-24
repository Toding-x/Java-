package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
    public static void main(String[] args)throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下q结束");
        do {
            c=(char) br.read();
            System.out.println(c);
        }while (c!='q');
    }
}
