package Demo;

import java.io.*;

public class Demo3 {
    public static void main(String[] args){
        try{
            int demo[] = {1,2,3,4,5,6,7,8,9};
            OutputStream os = new FileOutputStream("demo.txt");
            OutputStreamWriter writer = new OutputStreamWriter(os,"utf-8");
            writer.append("中文输入");
            writer.append("\r\n");
            for (int i = 0; i < demo.length ; i++) {
                writer.append(String.valueOf(demo[i]));
            }
            writer.append("\r\n");
            writer.append("English");
            writer.close();
            InputStream is = new FileInputStream("demo.txt");
            InputStreamReader reader = new InputStreamReader(is,"utf-8");
            StringBuffer sb = new StringBuffer();
            int ch;
            while ((ch = reader.read()) !=-1){
                sb.append((char)ch);
            }
            System.out.println(sb);
            reader.close();
        }catch (IOException e){
            System.out.println("Exception");
        }
    }
}
