import MrChiWeekEndSnack.Functions.FactoriaOf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoriaOfTest {


        @Test
        void testFactorialOf() {
            Assertions.assertEquals(1, FactoriaOf.factorialOf(0));
            assertEquals(1, FactoriaOf.factorialOf(1));
            assertEquals(120, FactoriaOf.factorialOf(5));




        }
    }


