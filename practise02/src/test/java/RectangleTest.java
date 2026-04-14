import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RectangleTest {
    Rectangle rectangle=new Rectangle(2,3);
    @Test
    void area() {
        rectangle.area();
        assertEquals(6,rectangle.area());
    }

    @Test
    void perimeter() {
        rectangle.perimeter();
        assertEquals(10,rectangle.perimeter());
    }
}