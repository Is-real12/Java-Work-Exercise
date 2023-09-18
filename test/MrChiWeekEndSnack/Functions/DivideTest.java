package MrChiWeekEndSnack.Functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

        @Test
        void testDivide() {
            assertEquals(2.33, Divide.divide(7, 3), 0.01);
            assertEquals(0, Divide.divide(5, 0), 0.01);
            assertEquals(0.66, Divide.divide(2, 3), 0.01);

        }
    }


