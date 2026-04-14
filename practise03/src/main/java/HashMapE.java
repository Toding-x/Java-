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
        // 建议：变量名尽量用 maxScore 这种小驼峰，后面读代码会更顺。
        // 给你的练习任务：
        // 1. 把 MaxScore 改成 maxScore。
        // 2. 把初始值改成 Integer.MIN_VALUE，再自己造一组“全是负数”的数据测一下。
        // 3. 再写一个 Collections.max(map.values()) 的版本，对比两种写法的可读性。
        // 想一想：为什么“这题数据没问题”不代表“代码习惯也没问题”？
        // TODO（优先级3）：变量名改成 maxScore，顺手把初始值边界问题一起修掉。
        int MaxScore =0;
        for (int score : map.values()){
            // 这里的 for-each 可以理解成：把 map.values() 里的每个分数依次取出来。
            // 再想深一层：这段代码现在能跑，但如果以后题目里允许负分，初始值 0 就不够稳了。
            // 更稳的习惯是用 Integer.MIN_VALUE，或者直接用 Collections.max(map.values())。
            if (score>=MaxScore){
            MaxScore=score;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            // 这段拆 key/value 的写法是对的，说明你已经开始理解 entrySet 的遍历方式了。
            int score = entry.getValue();
            String name = entry.getKey();

            if(score==MaxScore){
                list.add(name);
            }

        }
        System.out.println("最高分为"+MaxScore+"的同学是"+list);

    }
}

