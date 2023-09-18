package MrChiWeekEndSnack.Functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtracterTest {
    @Test
    void testSubtract() {
        assertEquals(4, Subtracter.subtract(3, 7));
        assertEquals(4, Subtracter.subtract(7, 3));
    }

}