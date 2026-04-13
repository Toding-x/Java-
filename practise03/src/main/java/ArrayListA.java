import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListA {
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            int count = iterator.next();
            if (count%2==0){
                iterator.remove();
            }
        }
        System.out.println(arr);
    }
    //还是不怎么熟练，在使用iterator这个地方还是不熟练，可以加强练习
}
