import java.util.List;


public class Landbm02 {
    public static void main(String[] args) {
        List<String> names = List.of("alice", "bob", "carol");
        names.forEach(name->{String upper = name.toUpperCase();
            System.out.println("你好，"+upper);
        });
    }
}
