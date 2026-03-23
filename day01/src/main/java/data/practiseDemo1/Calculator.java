package data.practiseDemo1;

public class Calculator {
    private double n1;
    private double n2;
    private String operator;

    public double result(double n1, double n2, String operator) {
        this.n1 = n1;
        this.n2 = n2;
        this.operator = operator;
            if (operator.equals("+")) {
                return add(n1, n2);
            } else if (operator.equals("-")) {
                return subtract(n1, n2);
            } else if (operator.equals("*")) {
                return multiply(n1, n2);
            } else if (operator.equals("/")) {
                return divide(n1, n2);
            }else throw new  IllegalArgumentException("输入非法符号");
    }
    public double add(double a,double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public  double divide( double a , double b){
        if(b == 0){
            throw  new ArithmeticException("除数不为0");
        }
        return a/b;
    }
}



