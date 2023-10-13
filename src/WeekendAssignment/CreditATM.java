package WeekendAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class CreditATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arr = {4, 3, 8, 8, 5, 7, 6, 0, 1, 8, 4, 0, 2, 6, 2, 6};
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }

        int digit = 1;
        int count = 0;
        int result = 0;
        int oddDigit = 0;

        int finalResult = 0;
        int [] even = new int[14];
        for (int i = 0; i < arr.length; i++) {

            if (count % 2 == 1) {

               even[count] +=arr[count];
//                arr[i] = count;
//                System.out.println("arr[i] = " + Arrays.toString(arr[count]));
              ;
            }
            count++;
        };
        System.out.println(Arrays.toString(even));
    }
}