import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JJTest {
    @Test
    void checking() {
        JJ dataExtraction = new JJ();
        int[][] arr = {
                {4, 2, 5, 6},
                {3, 1, 9, 0},
                {14, 12, 17, 16}
        };
        int coolumn = 2;
        int startPosition = 2;
        int endPosition = 4;

        int[][] result = JJ.UserBenefit(arr, coolumn, startPosition, endPosition);

//        assertEquals();
//        assertEquals();
//        assertEquals();
//        assertEquals(3, result.length);
//
//
//    }


    }
}