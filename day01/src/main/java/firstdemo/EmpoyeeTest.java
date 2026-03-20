package firstdemo;

public class EmpoyeeTest {
    public static  void  main(String[] args){
        Employee employee1 = new Employee("吴成杰");
        Employee employee2 = new Employee("吴能杰");

        employee1.setAge(23);
        employee1.setDesignation("程序员");
        employee1.setSalary(5000);
        employee1.printEmployee();

        employee2.setAge(24);
        employee2.setDesignation("程序员");
        employee2.setSalary(5000);
        employee2.printEmployee();

    }
}
