package MrChiWeekEndSnack.Functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isEvenTest {
    @Test
    public void CheckingIfItEven(){
     boolean result = isEven.oddOrEven(8);
     assertEquals(true, result);
    }
@Test
    void checkingIfOdd(){
        boolean odd = isEven.oddOrEven(7);
    assertEquals(false, odd);
}

    }

