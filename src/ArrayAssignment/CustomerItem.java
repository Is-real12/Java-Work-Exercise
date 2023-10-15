package ArrayAssignment;

import java.util.Scanner;

public class CustomerItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] testing = new int[4][3];


        for (int i = 0; i < testing.length; i++) {
            for (int j = 0; j < testing[i].length; j++) {
                System.out.print("Enter price item "+(j+1)+" for customer "+(i+1)+": ");
                int item = scanner.nextInt();
                testing[i][j] = item;

            }
        }
        System.out.println("\t\t\t Item 1     item 2      item 3");
        for (int i = 0; i < testing.length; i++) {
            System.out.print("\nCustomer "+"("+(i+1)+")");
            for (int j = 0; j < testing[i].length; j++) {

                System.out.printf("\t%d\t    ",testing[i][j]);

            }
            System.out.println();
        }









    }
}
