package MrChiWeekEndSnack.Functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorOfTest {
    @Test
    void testFactorOf() {
        int result =  FactorOf.factorOf(10);
        int resut1 = FactorOf.factorOf(25);
        assertEquals(4, result);
        assertEquals(3, resut1);

    }
}