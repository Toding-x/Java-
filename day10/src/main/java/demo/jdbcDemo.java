package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo {
    public static void main(String[]agrs)throws Exception{
        String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        String username = "student";
        String password = "123456";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        // 3. 创建 Statement 对象

        Statement stmt = conn.createStatement();
            String sql = "select *from student";
            ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            int id = rs.getInt("id");
            String name =rs.getString("name");
            int age = rs.getInt("age");
            String gender = rs.getString("gender");
            String classroom = rs.getString("classroom");
            System.out.println(id+""+name+""+age+""+gender+""+classroom+"");
        }
        String insertsql ="insert into student(id,name,age,gender,classroom)value(38,'吴成杰',23,'男','22软工三班')";
        int rows =stmt.executeUpdate(insertsql);
        System.out.println("影响行数"+rows);
        rs.close();
        stmt.close();
        conn.close();
    }
}
