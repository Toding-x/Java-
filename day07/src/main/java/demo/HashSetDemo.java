package demo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[]args){
    HashSet<String> site = new HashSet<String>();
    site.add("吴成杰");
    site.add("吴能杰");
    site.add("吴有杰");
    site.add("吴杰");
    System.out.println(site);
    System.out.println(site.contains("吴成杰"));
    site.remove("吴杰");
    System.out.println(site);
    System.out.println("有"+site.size()+"个");
    for(String k : site){
        System.out.println(k);
    }
    site.clear();
    System.out.println(site);
    }
}
