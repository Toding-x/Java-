package data.practiseDemo1;

public class Calculator {

    public double result(double n1, double n2, String operator) {

            // 这里最好写成 "+".equals(operator)，这样 operator 是 null 时也不会报空指针。
            if (operator.equals("+")) {
                return add(n1, n2);
            } else if (operator.equals("-")) {
                return subtract(n1, n2);
            } else if (operator.equals("*")) {
                return multiply(n1, n2);
            } else if (operator.equals("/")) {
                return divide(n1, n2);
            } else {
                // 如果想支持 %，这里也要加分支，不然会走到“输入非法符号”。
                throw new IllegalArgumentException("输入非法符号");
            }
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
            // 这里的提示建议改成“除数不能为0”，这样更直白。
            throw  new ArithmeticException("除数不为0");
        }
        return a/b;
    }


}