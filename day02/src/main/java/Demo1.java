import java.time.LocalDate;

public class Demo1 {
    public static  void  main(String[] args){
        LocalDate today =LocalDate.now();
        System.out.println("当前日期："+today);

        LocalDate nationalDay = LocalDate.of(2025,10,1);
        System.out.println("国庆节： "+nationalDay);

        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYears = today.minusYears(1);
        System.out.println("明天" +tomorrow);
        System.out.println("下个月" +nextMonth);
        System.out.println("去年今天" +lastYears);

    }
}
