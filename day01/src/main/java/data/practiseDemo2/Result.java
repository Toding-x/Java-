package data.practiseDemo2;

public class Result {
    private String numSr1;
    private String numSr2;
    private String operator;
    public  Result (String numSr1, String numSr2, String operator){
        this.numSr1=numSr1;
        this.numSr2=numSr2;
        this.operator=operator;
    }

    public String getNumSr1() {
        return numSr1;
    }

    public void setNumSr1(String numSr1) {
        this.numSr1 = numSr1;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getNumSr2() {
        return numSr2;
    }

    public void setNumSr2(String numSr2) {
        this.numSr2 = numSr2;
    }

    @Override
    public String toString() {
        return "Result{" +
                "numSr1='" + numSr1 + '\'' +
                ", numSr2='" + numSr2 + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}

