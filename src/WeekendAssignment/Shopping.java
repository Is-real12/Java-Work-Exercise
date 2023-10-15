//package WeekendAssignment;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Objects;
//import java.util.Scanner;
//
//public class Shopping {
//
//
//
//String astheric = " ";
//
//                Scanner scanner = new Scanner(System.in);
//
//
//        String Things_Bought = scanner.next();
//
//
//        System.out.println("how many pieces the user buy: ");
//        int pieces = scanner.nextInt();
//
//
//        System.out.println("How much per unit: ");
//        int per_unit = scanner.nextInt();
//
//        System.out.println("Add more Items: ");
//        String yes_or_No = scanner.next();
//       while (yes_or_No != "no"){
//               if (yes_or_No.equals("no")) {
//                       break;
//               }
//               System.out.println("What did the user buy: ");
////        String WillNotWork = scanner.next();
//               Things_Bought = scanner.next();
//               System.out.println("how many pieces the user buy: ");
//                pieces = scanner.nextInt();
//               System.out.println("How much per unit: ");
//                per_unit = scanner.nextInt();
//               System.out.println("Add more Items: ");
//               yes_or_No = scanner.next();
//
//
//       }
//       int per_unit_sum = 0;
//            for (int i = 1; i <= pieces; i++) {
//                per_unit_sum += per_unit;
//            }
//        System.out.println("What is your name: ");
//        String Cashier = scanner.next();
//        System.out.println("How much discount will he get: ");
//        int discount = scanner.nextInt();
//
//        int total_amount = 1+6;
//            System.out.printf("""
//                SEMICOLON STORES
//                MAIN BRANCH
//                LOCATION: 312, HERBERT MACAULAY MACAULAY WAY, SABO YABA, LAGOS.
//                TEL: 03293828343
//                Date: 18-Dec-22 8:48:11 pm
//                Cashier Name:"""+Cashier+ """
//                Customer Nmae: """+user_name+ """
//
//               ---------------------------------------------------------------------
//               ---------------------------------------------------------------------
//                                                ITEM    QTY     PRICE   TOTAL(NGN)
//               ---------------------------------------------------------------------
//               """+"                                 %s      %d      %d        %d\n",Things_Bought,pieces,per_unit,per_unit_sum);
////
//            int n = 5;
//            ArrayList<Integer> arr1 = new ArrayList<>();
//            ArrayList<Integer> arr2 = new ArrayList<>();
//            System.out.print("Enter your name: " );
//            String name = scanner.nextLine();
//            ArrayList<String> names = new ArrayList<>(Integer.parseInt(name));
//            System.out.println(name);
//
//            for (int i = 0; i <=n ; i++) {
//                  arr1.add(i);
//            }
//            System.out.print(arr1);
//
//
//                for (int i = 0; i < 2; i++) {
//                        System.out.print("Enter your name: " );
//                        String name = scanner.nextLine();
//                        String name1 = scanner.nextLine();
//                        ArrayList<String> names = new ArrayList<>();
//                        names.add(name);
//                        names.add(name1);
//
//
//
//                        for (int j = 0; j < names.size(); j++) {
//                                System.out.println(names.get(j));
//
//                        }
//                }
//
////                public static void outSide() {
////                int perfect_Total = 0;
////                        Scanner scanner = new Scanner(System.in);
////                        ArrayList<String> names = new ArrayList<>();
////                        ArrayList<String> thingsBuy = new ArrayList<>();
////                        ArrayList<Integer> the_Pieces = new ArrayList<>();
////                        ArrayList<Integer> per_unit1 = new ArrayList<>();
////
////                        System.out.println("What is yur name: ");
////                        String user_name = scanner.next();
////                        System.out.println("What did the user buy: ");
////                        String thingsBought = scanner.next();
////                        System.out.println("how many pieces the user buy: ");
////                        int pieces = scanner.nextInt();
////                        System.out.println("How much per unit: ");
////                        int per_unit = scanner.nextInt();
////
////                        thingsBuy.add(thingsBought);
////                        the_Pieces.add(pieces);
////                        per_unit1.add(per_unit);
////                        System.out.println("Add more Items: ");
////                       String yes_or_No = scanner.next();
////                        int per_unit_sum = 0;
////                        for (int i = 1; i <= pieces; i++) {
////                                per_unit_sum += per_unit;
////                        }
////
////                       while (!Objects.equals(yes_or_No, "no")) {
////                               System.out.println("What did the user buy: ");
////                               thingsBought = scanner.next();
////                               System.out.println("how many pieces the user buy: ");
////                               pieces = scanner.nextInt();
////                               System.out.println("How much per unit: ");
////                               per_unit = scanner.nextInt();
//
////                               System.out.println("Add more Items: ");
////                               yes_or_No = scanner.next();
////
////                               thingsBuy.add(thingsBought);
////                               the_Pieces.add(pieces);
////                               per_unit1.add(per_unit);
////                               per_unit_sum = 0;
////                               for (int i = 1; i <= pieces; i++) {
////                                       per_unit_sum += per_unit;
////                               }
////                       }
////                               System.out.println("What is your name: ");
////                               String Cashier = scanner.next();
////                               System.out.println("How much discount will he get: ");
////                               int discount = scanner.nextInt();
////
////                               System.out.printf("""
////                SEMICOLON STORES
////                MAIN BRANCH
////                LOCATION: 312, HERBERT MACAULAY MACAULAY WAY, SABO YABA, LAGOS.
////                TEL: 03293828343
////                Date: 18-Dec-22 8:48:11 pm
////                Cashier Name:"""+Cashier+ """
////                Customer Nmae: """+user_name+ """
//
////               ---------------------------------------------------------------------
////               ---------------------------------------------------------------------
////                                                ITEM    QTY     PRICE   TOTAL(NGN)
////               ---------------------------------------------------------------------
////               """+"                                 %s      %d      %d        %d\n",thingsBuy, the_Pieces, per_unit1,per_unit_sum);
////
////
////
////                }
////
////        public static void main(String[] args) {
////              outSide();
//
//        }
//
//        }
//
//
//
//
//
