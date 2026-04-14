import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayListB {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Alice");
        arr.add("Bob");
        arr.add("Charlie");
        arr.add("Alice");
        arr.add("Bob");
        arr.add("Alice");
        Iterator<String> iterator = arr.iterator();
        HashMap<String,Integer> hashMap = new HashMap<>();
        while (iterator.hasNext()){

            String count = iterator.next();
            hashMap.put(count,hashMap.getOrDefault(count,0)+1);
            //这里使用hashmap的Entry不熟练，可以多加练习
        }for (Map.Entry<String,Integer> entry:hashMap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
