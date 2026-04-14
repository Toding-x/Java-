import cn.hutool.core.date.DateUtil;

public class TestMaven {
    public static void main(String[] args) {
        String now = DateUtil.now();
        System.out.println("当前时间：" + now);
    }
}