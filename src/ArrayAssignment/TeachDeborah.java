package ArrayAssignment;

public class TeachDeborah {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <=n ; row++) {
            for (int j = 1; j <=row ; j++) {
                System.out.print("*");
            }
            for (int j = row; j <=5 ; j++) {
                System.out.print("   ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }
}
