import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    ArrayList<String> list = new ArrayList<>();
    public void select() {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public void remove(){
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if(it.next().length()>3){
                it.remove();
            }
        }

    }
}
