package practise.Service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practise.Service.DogService;
import practise.entity.Dog;

import static org.junit.jupiter.api.Assertions.*;

class DogServiceImplTest {

    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试结束");
    }

    @Test
    void writeAddress() {
        DogService dogService = new DogServiceImpl();
        Dog dog = new Dog("小狗","吃","骨头","小吴家");
        dogService.WriteAddress(dog);
    }
}