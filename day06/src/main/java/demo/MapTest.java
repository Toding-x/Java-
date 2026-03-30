package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[]args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "吴杰");
        map.put("2", "成杰");
        map.put("3", "吴成杰");

        //第一种：普遍使用，二次取值
        System.out.println("通过MAp.KeySet遍历key和value");
        for (String key : map.keySet()) {
            System.out.println("key=" + key + "\sand value=" + map.get(key));
        }
        //第二种通过Map.entrySet使用iterator遍历key和value
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key = " + entry.getKey() + "and value =" + entry.getValue());
        }
        //第三种容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + " and value =" + entry.getValue());
        }
        //第四中，和第一种差不多，就是再取值
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value = " + v);
            //自己尝试
            System.out.println("自己试一下");
            for (String k : map.keySet()) {
                System.out.println("key = " + k + " value = " + map.get(k));
            }
            System.out.println("自己尝试第二");
            for (Map.Entry<String,String> entry : map.entrySet()){
                System.out.println("key = "+entry.getKey()+" and value = "+entry.getValue());
            }
        }
    }
}
