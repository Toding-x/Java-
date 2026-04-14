package practise.entity;

public class Student extends Person {
    private double score;
    private int ranking;

    public Student(){}

    public Student(double score,String name,String classroom,boolean sex,int age,int id ){
        super(name,age,classroom,sex,id);
        this.ranking=0;
        this.score=score;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() +
                "score=" + score +
                ", ranking=" + ranking +
                '}';
    }
}
