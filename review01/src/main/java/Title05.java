import java.util.Comparator;
import java.util.List;

public class Title05 {
    void sort(List<Student> list){
    list.sort(Comparator.comparingDouble(Student::getScore).reversed());
    list.forEach(System.out::println);
    }
    List<Student> findMax(List<Student> list){
        Double maxScore = list.stream()
                .max(Comparator.comparingDouble(Student::getScore))
                .get()
                .getScore();
        List<Student> maxName = list.stream()
                .filter(student ->Double.compare(student.getScore(),maxScore)==0)
                .toList();
        maxName.forEach(name->System.out.println(name.getName()));
        return maxName;
    }
    List<Student> findScore(List<Student> list){
        List<Student> newlist = list.stream()
                .filter(student ->student.getScore()>=90)
                .toList();
        return newlist;
    }
}
