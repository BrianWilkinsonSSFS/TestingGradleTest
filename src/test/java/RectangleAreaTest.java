import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleAreaTest {

    @Test
    public void getArea() {
        assertEquals(15, RectangleArea.getArea(3, 5));
    }
}