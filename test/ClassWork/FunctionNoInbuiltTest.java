package ClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionNoInbuiltTest {

    @Test

    void Checking(){
        int result1 = FunctionNoInbuilt.withoutMultiplication(-5, -5);
        assertEquals(25, result1);
    }

}