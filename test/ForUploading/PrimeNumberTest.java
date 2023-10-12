import MrChiWeekEndSnack.Functions.PrimeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test
    void checkingIfPrime(){
        boolean result = PrimeNumber.PrimeNumbers(4);
        assertEquals(false, result);

    }

}