import java.sql.*;

public class UserDao {
        // 建议：练习阶段这样写能跑通流程，但真实项目里数据库账号密码不要直接写死在代码里。
        // 后面可以慢慢过渡到配置文件或环境变量，这样更安全，也更方便切换环境。
        private final String url = "jdbc:mysql://localhost:3306/user_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        private final String username = "student";
        private final String password = "123456";

    public void findAll(){
        // TODO（优先级1）：先把这里改成 try-with-resources，这是 JDBC 最值得先养成的习惯。
        // 完成标准：这个方法里不再手写 close，异常时资源也能正常释放。
        // 给你的练习任务：
        // 1. 把这里改成 try-with-resources。
        // 2. 试着让这个方法返回 List<User>，不要直接在 DAO 里打印。
        // 3. 再想一想：DAO 层如果一边查库一边打印，后面接页面时会不会别扭？
        String sql = "select * from user";
        try (
            // 建议：这里后面可以练一下 try-with-resources，能自动关闭连接、语句、结果集，少写很多 close。
            // 再追问自己一句：为什么 Java 专门给数据库、文件这些资源准备了自动关闭的写法？
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ){
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
            }

        } catch (SQLException e) {
            // 建议：练习里直接抛 RuntimeException 没问题；再进一小步的话，可以把 SQL 和关键信息一起带上，排错会更快。
            throw new RuntimeException("findAll 查询失败 sql ="+sql,e);

        }

    }
    public void insert(User user){
        // TODO（优先级2）：把 insert SQL 改成显式字段名写法，先把“能跑”升级成“更稳”。
        // 完成标准：SQL 类似 insert into user(id, name, age, username, password, address) values(...)
        // 给你的练习任务：
        // 1. 试着把 SQL 改成带字段名的 insert，别完全依赖表字段顺序。
        // 2. 想一想：为什么这里用 PreparedStatement，而查询那边你却用了 Statement？
//        因为PerparedStatement可以防止sql注入的风险，而Statement不能防止可能会有sql注入的风险
        // 3. 如果让你自己定规范，增删改查你会不会统一都优先用 PreparedStatement？

        String sql = "insert into user(id,name,age,username,password,address) values(?,?,?,?,?,?)";
        try (
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ){
            stmt.setInt(1, user.getId());
            stmt.setString(2,user.getName());
            stmt.setInt(3,user.getAge());
            stmt.setString(4,user.getUsername());
            stmt.setString(5,user.getPasssword());
            stmt.setString(6,user.getAddress());

            // 这里用 PreparedStatement 是个好习惯，说明你已经在避开字符串拼 SQL 的坑了。
            stmt.executeUpdate();
        }catch (Exception e){
            throw  new RuntimeException("添加失败"+sql,e);
        }
    }

}


