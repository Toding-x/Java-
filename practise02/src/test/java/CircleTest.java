import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle = new Circle(3);
    @Test
    void area() {

        assertEquals(Math.PI*9, circle.area());
    }

    @Test
    void perimeter() {
        assertEquals(Math.PI*6, circle.perimeter());
    }
}