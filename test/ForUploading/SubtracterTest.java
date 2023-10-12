import MrChiWeekEndSnack.Functions.Subtracter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtracterTest {
    @Test
    void testSubtract() {
        Assertions.assertEquals(4, Subtracter.subtract(3, 7));
        assertEquals(4, Subtracter.subtract(7, 3));
    }

}