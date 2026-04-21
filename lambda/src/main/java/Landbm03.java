import java.util.List;
import java.util.stream.Collectors;

public class Landbm03 {
    public static void main(String[] args) {
        List<Integer> scores = List.of(55, 80, 43, 92, 67);
        List<Integer> passed = scores.stream()
                .filter(score -> score >= 60)
                .collect(Collectors.toList());
        System.out.println(passed);
    }
}
