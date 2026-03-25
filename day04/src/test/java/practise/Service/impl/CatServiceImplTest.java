package practise.Service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practise.entity.Cat;

import static org.junit.jupiter.api.Assertions.*;
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
        Cat cat = new Cat("小猫","鱼","吃","小王");
        CatServiceImpl catService = new CatServiceImpl();
        catService.Write(cat);
    }
}