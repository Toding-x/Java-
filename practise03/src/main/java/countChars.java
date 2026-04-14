import java.util.HashMap;
import java.util.Map;

public class countChars {
    public static void main(String[]args){
        String str="hello world";
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            map.put(s,map.getOrDefault(s,0)+1);


            }
        for(Map.Entry<String,Integer>entry: map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+"="+value);
        }
        }

    }


