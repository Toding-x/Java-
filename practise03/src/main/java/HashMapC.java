import java.util.HashMap;
import java.util.Map;

public class HashMapC {
    public static void main(String[] args) {
        String str ="java is good and java is fun";
        HashMap<String,Integer> hashMap = new HashMap<>();
        String [] s =str.split(" ");
            //这个地方特别不会熟悉,split的用法不熟悉
        for (int i = 0; i <s.length; i++) {
            String word =s[i];

            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String,Integer> entry : hashMap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            if(value >=2){
                System.out.println(key+"="+value);
            }
        }
    }
}
