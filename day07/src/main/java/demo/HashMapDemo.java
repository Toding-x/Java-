package demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[]agrs){
        HashMap<Integer,String> sit = new HashMap<Integer,String>();
        sit.put(1,"杰杰");
        sit.put(2,"杰杰");
        sit.put(3,"杰杰");
        System.out.println(sit);
        System.out.println(sit.get(2));
        System.out.println(sit.remove(2));
        System.out.println(sit);
        System.out.println(sit.size());
//        for (Map.Entry<Integer,String> entry : sit.entrySet()){
//            System.out.println("输出key = "+entry.getKey()+"\svalue =\s"+entry.getValue());
//        }
        for (Integer k : sit.keySet()){
            System.out.println("输出key = "+k+"\svalue =\s"+sit.get(k));        }
    }

}
