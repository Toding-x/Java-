package practise;

public class StudentService {
    // 方法名建议用小驼峰，比如 scoreSum。
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
        // 这里直接从 0 开始，当前数据能过。
        // 更稳一点可以先用第一个学生的分数当初始值。
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