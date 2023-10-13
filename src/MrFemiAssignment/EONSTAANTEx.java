package MrFemiAssignment;

import java.util.Scanner;

public class EONSTAANTEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter terms: ");
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms to calculate: ");
        int numTerms = scanner.nextInt();

        double ex = 1.0;
        double powerOfX = 1.0;
        double factorial = 1.0;
        int i = 1;

        while (i < numTerms) {
            powerOfX *= x;
            factorial *= i;
            ex += powerOfX / factorial;
            i++;
        }

        System.out.println("Estimated value of e power" + x + " using " + numTerms + " terms: " + ex);

    }
}
