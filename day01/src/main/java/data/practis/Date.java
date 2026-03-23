package data.practis;
import java.util.Scanner;

public class Date {
/*/
写一个计算器程序，处理不同类型的数字运算
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator cal = new Calculator();
    System.out.println("====================\n");
    System.out.println("运算符：加 + 减 - 乘 *  除 / 求余 %");
    System.out.println("退出请输入 exit\n");

    while (true) {
        System.out.println("请用户输入表达式");
        String input = sc.nextLine().trim();

        if ("exit".equalsIgnoreCase(input)) {
            System.out.println("计算机使用结束");
            break;

        }

        String[] n = input.split("\\s+");
        if (n.length != 3) {
            throw new IllegalArgumentException("输入格式错误！请按「数字 运算符 数字」格式输入");
        }


        double n1 = Double.parseDouble(n[0]);
        String operator = n[1];
        double n2 = Double.parseDouble(n[2]);
        double result = cal.result(n1, n2, operator);

        String resultStr = (result == (long) result) ?
                String.valueOf((long) result) :
                String.valueOf(result);
        System.out.printf("运算结果：%s %s %s = %s\n\n", n1, operator, n2, resultStr);

    }
    sc.close();
  }}


