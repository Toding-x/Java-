package data.practiseDemo1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试成功");
    }

    @Test
    void result() {
        Calculator cal = new Calculator();
        assertEquals(cal.result(1, 2, "+"), 3);
        assertEquals(cal.result(2,3,"-"), -1);
        assertEquals(cal.result(2,3,"*"),6);
        assertEquals(cal.result(4,2,"/"),2);
    }

    @Test
    void add() {
        Calculator cal = new Calculator();
        assertEquals(3,cal.add(1,2));
    }

    @Test
    void subtract() {
        Calculator cal = new Calculator();
        assertEquals(5,cal.subtract(10,5));
    }

    @Test
    void multiply() {
        Calculator cal = new Calculator();
        assertEquals(10,cal.multiply(2,5));
    }

    @Test
    void divide() {
        Calculator cal = new Calculator();
        assertEquals(2,cal.divide(10,5));
    }
}