import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class ListDemoTest {
    ListDemo listDemo = new ListDemo();


    @BeforeEach
    void setUp() {
        ArrayList<String> list = new ArrayList<>();
        list.add("北京");
        list.add("哈尔滨");
        list.add("上海");
        list.add("广州");
        list.add("乌鲁木齐");
    }

    @Test
    void select() {
        listDemo.select();
    }

    @Test
    void remove() {
        listDemo.remove();
    }
}