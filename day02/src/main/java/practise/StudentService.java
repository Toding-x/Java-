package practise;

public class StudentService {
    public double ScoreSum(Student[] students){
        if(students == null || students.length == 0){
            return  0;
        }
        double sum=0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        return sum;
    }

    public double ScoreAverage(Student[] students){
        if(students == null || students.length == 0){
            return  0;
        }
        double sum =ScoreSum(students);
        return sum/students.length;
    }
    public double ScoreMax(Student[] students){
        if(students == null || students.length == 0){
            return  0;
        }
        double max = 0;
        for (int i = 0; i < students.length; i++) {
            if (max >= students[i].getScore()){

            }else {
                max =students[i].getScore();
            }
        }
        return max;
    }
}
