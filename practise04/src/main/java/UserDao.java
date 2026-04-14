import java.sql.*;

public class UserDao {
        private final String url = "jdbc:mysql://localhost:3306/user_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        private final String username = "student";
        private final String password = "123456";

    public void findAll(){
        String sql = "select * from user";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                User user = new User();
                user.setId (rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setUsername(rs.getString("username"));
                user.setPasssword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                System.out.println(user.getId() + " " + user.getName() + " " + user.getAge() + " " + user.getUsername() + " " + user.getPasssword() + " " + user.getAddress());
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }
    public void insert(User user){
        String sql = "insert into user values(?,?,?,?,?,?)";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, user.getId());
            stmt.setString(2,user.getName());
            stmt.setInt(3,user.getAge());
            stmt.setString(4,user.getUsername());
            stmt.setString(5,user.getPasssword());
            stmt.setString(6,user.getAddress());

            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
