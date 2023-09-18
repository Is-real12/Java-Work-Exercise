package FunctionTest;

import MrChiWeekEndSnack.Functions.IsSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSquareTest {
    @Test
    void testIsSquare() {
        boolean result = IsSquare.isSquare(25);
        assertTrue(result);

        boolean resut1 = IsSquare.isSquare(20);
        assertFalse(resut1);
    }
}