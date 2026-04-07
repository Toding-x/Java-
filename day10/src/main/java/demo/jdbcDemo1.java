package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo1 {
    public static void main(String [] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        String username = "student";
        String password ="123456";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement stmt = conn.createStatement();
        String sql = "select *from student";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            int id = rs.getInt("id");
            String name =rs.getString("name");
            int age = rs.getInt("age");
            String gender = rs.getString("gender");
            String classroom = rs.getString("classroom");
            System.out.println(id+""+name+""+age+""+gender+""+classroom+"");

        }
    rs.close();

    }
}
