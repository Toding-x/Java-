import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapE {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Alice", 88);
        map.put("Bob", 95);
        map.put("Charlie", 72);
        map.put("Diana", 95);
        int MaxScore =0;
        for (int score : map.values()){
            //对这个给forech循环不太熟悉
            if (score>=MaxScore){
            MaxScore=score;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            int score = entry.getValue();
            String name = entry.getKey();

            if(score==MaxScore){
                list.add(name);
            }

        }
        System.out.println("最高分为"+MaxScore+"的同学是"+list);

    }
}
