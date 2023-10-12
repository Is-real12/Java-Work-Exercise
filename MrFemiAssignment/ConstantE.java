package MrFemiAssignment;

import java.util.Scanner;

public class ConstantE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("ENTER THE TERMS: ");
//        int terms = scanner.nextInt();
//        int result = 1;
//        int constantE;
//        while (terms>1){
////            result*=terms;
////            terms--;
//           if (terms == 5){
//               result*=terms;
//               terms--;
//           }
//            if (terms == 4){
//                result*=terms;
//                terms--;
//            }
//            if (terms == 3){
//                result*=terms;
//                terms--;
//            }
//            if (terms == 2){
//                result*=terms;
//                terms--;
//            }
//            if (terms == 1){
//                result*=terms;
//                terms--;
//            }
//        }
//        System.out.println(result);



        System.out.print("Enter the number of terms to calculate for e: ");
        int numTerms = scanner.nextInt();

        int eEstimation = 1;
        int factorial = 1;
        int i = 1;

        while (i < numTerms) {
            factorial *= i;
            eEstimation += 1.0 / factorial;
            i++;
        }

        System.out.println("Estimated value of e using " + numTerms + " terms: " + eEstimation);
    }
}
