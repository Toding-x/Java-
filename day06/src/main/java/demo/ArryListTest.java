package demo;

import java.util.Iterator;
import java.util.List;

public class ArryListTest {
    public void raverse(List<String> list){
        for (String str : list ){
            System.out.println(str);
        }
    }
    public void reverse1(List<String>list){
        String [] strArry = new String[list.size()];
        list.toArray(strArry);
         for (String str :strArry){
            System.out.println(str);
        }
    }
    public void reverse2(List<String> list){
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
        System.out.println(ite.next());
        }
    }
}
