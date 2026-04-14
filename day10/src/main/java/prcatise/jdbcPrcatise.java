package prcatise;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class jdbcPrcatise {
    public static void main(String[]args)throws Exception{
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        String url ="jdbc:mysql://localhost:3306/company?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8&useUnicode=true";
        String username = "student";
        String password = "123456";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement stmt = conn.createStatement();
        String sql = "select *from employee";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            Double salary = rs.getDouble("salary");
            String dept = rs.getString("dept");
            System.out.println(id+"\n"+name+"\n"+salary+"\n"+dept);

        }
        rs.close();
    }
}
