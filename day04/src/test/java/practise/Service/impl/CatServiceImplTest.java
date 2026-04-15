package practise.Service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practise.entity.Cat;

class CatServiceImplTest {

    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void write() {
        Cat cat = new Cat("小猫","吃","鱼","小王");
        CatServiceImpl catService = new CatServiceImpl();
        // 这里只是调用方法，没有检查结果，测试作用会比较弱。
        Assertions.assertEquals("小猫",catService.setName(cat));
        Assertions.assertEquals("鱼",catService.eatFood(cat));
        Assertions.assertEquals("吃",catService.actionMove(cat));
        Assertions.assertEquals("小王",cat.getMaster());
        catService.Write(cat);
    }
}