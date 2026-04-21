import java.util.*;

public class Title01 {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        for (int i = 0; i <input.length() ; i++) {
             Character str = input.charAt(i);
             map.put(str,map.getOrDefault(str,0)+1);
        }
        int maxValue = Collections.max(map.values());
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue()== maxValue){
                System.out.println("出现最多的字符是["+entry.getKey()+"],共出现"+maxValue+"次");
            }
        }
    }
}
