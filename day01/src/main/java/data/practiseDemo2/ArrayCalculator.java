package data.practiseDemo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayCalculator {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("支持运算符 ‘+’ ‘-’ ‘*’ ‘/’ ");
        System.out.println("退出运算输入“exit” ");
        while(true){
            try {
            System.out.println("请输入表达式");
            String input =scanner.nextLine().trim();
            if("exit".equalsIgnoreCase(input)){
                break;
            }
            Result result = arrayResult(input);
            double num1 =Double.parseDouble(result.getNumSr1());
            double num2 = Double.parseDouble(result.getNumSr2());
            validateDecimalFormat(result.getNumSr1());
            validateDecimalFormat(result.getNumSr2());
            double calculationResult = calculate(num1,num2,result.getOperator());
            System.out.println("结果：" + calculationResult);
            }catch (IllegalCallerException e){
                System.out.println("错误："+ e.getMessage()+ "\n");
            } catch (ArithmeticException e) {
                System.out.println("错误：" + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("未知错误：" + e.getMessage() + "\n");
            }
        }

        scanner.close();
    }
    public static Result arrayResult(String number){
        char[] arry = number.toCharArray();
        List<Character>numChar1=new ArrayList<>();
        List<Character>numChar2=new ArrayList<>();
        String operator = null;
        boolean isSecondNum = false;

        for (char c : arry){
            if (Character.isWhitespace(c)){
                continue;
            }
            if (Character.isDigit(c) || c == '.'){
                if(isSecondNum != true){
                    numChar1.add(c);
                }else {
                    numChar2.add(c);
                }
            } else if (isOperator(c)) {
                if (operator !=null){
                    throw new IllegalArgumentException("运算只允许一个运算符");
                }
                isSecondNum =true;
                operator=String.valueOf(c);
            }else {
                throw new  IllegalArgumentException("包含非法字符"+c);
            }
        }
        if (operator == null) {
            throw new IllegalArgumentException("未找到有效运算符！");
        }
        if (numChar1.isEmpty()) {
            throw new IllegalArgumentException("第一个数字不能为空！");
        }
        if (numChar2.isEmpty()) {
            throw new IllegalArgumentException("第二个数字不能为空！");
        }
        String numSr1 =listToString(numChar1);
        String numSr2 = listToString(numChar2);

        return new Result(numSr1,numSr2,operator);
    }

    public static boolean isOperator(char c){
        return c=='+' || c=='-' || c=='*' || c=='/';
    }

    public static String listToString(List<Character> list){
        StringBuilder sb = new StringBuilder();
        for (char c : list ){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void validateDecimalFormat(String numSr){
        int count = 0;
        for (char c : numSr.toCharArray()){
            if (c=='.'){
                count++;
            }
        }
        if (count > 1){
            throw new IllegalArgumentException("数字格式错误：包含多个小数点 → " + numSr);
        }
    }
    private static double calculate(double num1, double num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    throw new ArithmeticException("除数不能为0");
                }
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("不支持的运算符：" + operator);
        };
    }

}
