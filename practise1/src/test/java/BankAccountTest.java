import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {
    BankAccount bat=new BankAccount("张三",1000.0);
    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void deposite() {
        bat.deposite(-500);
    }

    @Test
    void withdraw() {
        bat.withdraw(1500);
    }
}