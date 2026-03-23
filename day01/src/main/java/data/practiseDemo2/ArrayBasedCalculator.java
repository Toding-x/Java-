package data.practiseDemo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayBasedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== 数组版计算器 =====");
        System.out.println("支持运算：+、-、*、/");
        System.out.println("输入示例：123+456  或  78.9-23.4  输入exit退出\n");

        while (true) {
            try {
                System.out.print("请输入运算表达式：");
                String input = scanner.nextLine().trim();

                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("计算器已退出！");
                    break;
                }

                ParseResult result = parseExpression(input);
                double num1 = Double.parseDouble(result.num1Str);
                double num2 = Double.parseDouble(result.num2Str);
                String operator = result.operator;

                double calculateResult = calculate(num1, num2, operator);

                String outputResult = (calculateResult == (long) calculateResult) ?
                        String.valueOf((long) calculateResult) :
                        String.valueOf(calculateResult);
                System.out.printf("运算结果：%s %s %s = %s\n\n", num1, operator, num2, outputResult);

            } catch (IllegalArgumentException e) {
                System.out.println("错误：" + e.getMessage() + "\n");
            } catch (ArithmeticException e) {
                System.out.println("错误：" + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("未知错误：" + e.getMessage() + "\n");
            }
        }
        scanner.close();
    }

    private static ParseResult parseExpression(String expression) {

        char[] chars = expression.toCharArray();
        List<Character> num1Chars = new ArrayList<>();
        List<Character> num2Chars = new ArrayList<>();
        String operator = null;
        boolean isSecondNum = false;


        for (char c : chars) {

            if (Character.isWhitespace(c)) {
                continue;
            }


            if (Character.isDigit(c) || c == '.') {
                if (!isSecondNum) {

                    num1Chars.add(c);
                } else {

                    num2Chars.add(c);
                }
            } else if (isOperator(c)) {

                if (operator != null) {
                    throw new IllegalArgumentException("表达式只能包含一个运算符！");
                }
                operator = String.valueOf(c);
                isSecondNum = true;
            } else {

                throw new IllegalArgumentException("包含非法字符：" + c);
            }
        }


        if (operator == null) {
            throw new IllegalArgumentException("未找到有效运算符！");
        }
        if (num1Chars.isEmpty()) {
            throw new IllegalArgumentException("第一个数字不能为空！");
        }
        if (num2Chars.isEmpty()) {
            throw new IllegalArgumentException("第二个数字不能为空！");
        }


        String num1Str = charListToString(num1Chars);
        String num2Str = charListToString(num2Chars);


        validateDecimalFormat(num1Str);
        validateDecimalFormat(num2Str);

        return new ParseResult(num1Str, num2Str, operator);
    }


    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }


    private static String charListToString(List<Character> charList) {
        StringBuilder sb = new StringBuilder();
        for (char c : charList) {
            sb.append(c);
        }
        return sb.toString();
    }


    private static void validateDecimalFormat(String numStr) {
        int dotCount = 0;
        for (char c : numStr.toCharArray()) {
            if (c == '.') {
                dotCount++;
            }
        }
        if (dotCount > 1) {
            throw new IllegalArgumentException("数字格式错误：包含多个小数点 → " + numStr);
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


    static class ParseResult {
        String num1Str;
        String num2Str;
        String operator;

        public ParseResult(String num1Str, String num2Str, String operator) {
            this.num1Str = num1Str;
            this.num2Str = num2Str;
            this.operator = operator;
        }
    }
}