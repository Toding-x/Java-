package practise;

public class StudentService {
    public double ScoreSum(Student[] score){
        if(score == null || score.length == 0){
            return  0;
        }
        double sum=0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i].getScore();
        }
        return sum;
    }

    public double ScoreAverage(Student[] score){
        if(score == null || score.length == 0){
            return  0;
        }
        double sum =ScoreSum(score);
        return sum/score.length;
    }
    public double ScoreMax(Student[] score){
        if(score == null || score.length == 0){
            return  0;
        }
        double max = 0;
        for (int i = 0; i < score.length; i++) {
            if (max >= score[i].getScore()){

            }else {
                max =score[i].getScore();
            }
        }
        return max;
    }
}
