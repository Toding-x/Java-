package demo;
import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    LinkedList<String> list = new LinkedList<String>(List.of("吴", "成", "杰"));

    public void ListAdd() {
        list.addLast("纯");
        System.out.println(list);
    }

    public void ListRemove(){
        list.removeLast();
        System.out.println(list);

    }
    public void ListGet(){
        list.getFirst();
        list.getLast();
        System.out.println(list);
    }
    public void ListTraverse(){
        for (String str : list){
            System.out.println(str);
        }
    }

}