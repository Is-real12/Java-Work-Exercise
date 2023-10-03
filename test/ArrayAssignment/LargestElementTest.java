package ArrayAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LargestElementTest {

    @Test
    void largester() {

       int [] element = {2, 4, 5, 6,7 ,8};
assertEquals(8, LargestElement.largester(element));


    }

    @Test
    void reverseList() {
        int [] element = {2, 4, 5, 6,7 ,8};
        int [] reverse = {8, 7, 6, 5, 4, 2};

        assertEquals(true,  LargestElement.reverseList(element, reverse));
    }

    @Test
    void isElementInArray() {
        int [] element = {2, 4, 5, 6,7 ,8};

        assertEquals(false,  LargestElement.isElementInArray(element, 19));

    }

    @Test
    void odd_Number() {
        int[] element = {2, 4, 5, 6,7 ,8};
        assertEquals(2, LargestElement.odd_num(element));
    }
}