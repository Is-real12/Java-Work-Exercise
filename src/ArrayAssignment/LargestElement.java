package ArrayAssignment;

public class LargestElement{

    public static int largester(){

        int[] element = {1, 4, 6, 5, 2, 3, 9};
        int largest = element[0];

        for (int i=0; i < element.length; i++){

            if(element [i] > largest){
                largest= element[i];
            }
        }
        return largest;

    }

        public static void reverseList() {
            int[] pal = {3, 6, 9, 5};

            for (int i = pal.length - 1; i >= 0; i--) {
                System.out.print(pal[i] + " ");
            }
        }

        public static boolean isElementInArray(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return true;
                }
            }
            return false;
        }


}