import java.sql.*;

public class UserDao {
        // 建议：练习阶段这样写能跑通流程，但真实项目里数据库账号密码不要直接写死在代码里。
        // 后面可以慢慢过渡到配置文件或环境变量，这样更安全，也更方便切换环境。
        private final String url = "jdbc:mysql://localhost:3306/user_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        private final String username = "student";
        private final String password = "123456";

    public void findAll(){
        String sql = "select * from user";
        try {
            // 建议：这里后面可以练一下 try-with-resources，能自动关闭连接、语句、结果集，少写很多 close。
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
                // 建议：DAO 层最好只负责“查数据”，打印更适合放到调用方。
                // 你现在这样写能看见结果，但层次再往后做大时，职责会容易混在一起。
                System.out.println(user.getId() + " " + user.getName() + " " + user.getAge() + " " + user.getUsername() + " " + user.getPasssword() + " " + user.getAddress());
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            // 建议：练习里直接抛 RuntimeException 没问题；再进一小步的话，可以把 SQL 和关键信息一起带上，排错会更快。
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

            // 这里用 PreparedStatement 是个好习惯，说明你已经在避开字符串拼 SQL 的坑了。
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
