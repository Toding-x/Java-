import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class HashMapD {
    public static void main(String[] args) {
        String[] fruit ={"apple","avocado","banana","blueberry","cherry","apricot"};
        HashMap<String,ArrayList<String>> hashMap = new HashMap();
        for (int i = 0; i < fruit.length; i++){
            String fruits = fruit[i].substring(0,1);
            //这里的substring的用法不熟悉
            if(!hashMap.containsKey(fruits)){
                //这里的containsKey是用来比较key存不存在
                hashMap.put(fruits,new ArrayList<>());
            }
            hashMap.get(fruits).add(fruit[i]);
        }
        for (Map.Entry<String,ArrayList<String>> entry: hashMap.entrySet()){
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
