
import org.junit.jupiter.api.Test;


class UserDaoTest {

    @Test
    void findAll() {
        UserDao userDao = new UserDao();
        userDao.findAll();
    }

    @Test
    void insert() {
        User user = new User();
        user.setId(6);
        user.setAge(23);
        user.setName("吴成杰");
        user.setUsername("跟踪狂");
        user.setPasssword("123456");
        user.setAddress("宁德时代");
        UserDao userDao = new UserDao();
        userDao.insert(user);
    }
}