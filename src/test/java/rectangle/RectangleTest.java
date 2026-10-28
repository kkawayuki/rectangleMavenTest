package rectangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * These tests pass and cover every line, but they deliberately leave gaps
 * that mutation testing (PIT) will expose.
 */
class RectangleTest {

    @Test
    void areaIsWidthTimesHeight() {
        assertEquals(20.0, new Rectangle(4, 5).getArea());
    }

    @Test
    void perimeterIsTwiceWidthPlusHeight() {
        assertEquals(18.0, new Rectangle(4, 5).getPerimeter());
    }

    @Test
    void equalSidesIsSquare() {
        assertTrue(new Rectangle(3, 3).isSquare());
    }

    @Test
    void defaultIsOneByOne() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getWidth());
        assertEquals(1.0, r.getHeight());
    }

    @Test
    void negativeWidthIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 5));
    }

    @Test
    void negativeHeightIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -1));
    }
}
