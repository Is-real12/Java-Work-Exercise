package FunctionTest;

import MrChiWeekEndSnack.Functions.BackToSenderLog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackToSenderLogTest {
    @Test
    public void forLessThan50Percent() {
        int result = BackToSenderLog.calculateRiderPayment(4);
        assertEquals(8000, result);
    }

    @Test
    public void for50To59Percent() {
        int result = BackToSenderLog.calculateRiderPayment(5);
        assertEquals(9000, result);
    }

    @Test
    public void for60To69Percent() {
        int result = BackToSenderLog.calculateRiderPayment(20);
        assertEquals(32000, result);
    }

    @Test
    public void for70PercentAndAbove() {
        int result = BackToSenderLog.calculateRiderPayment(80);
        assertEquals(104000, result);
    }
}
