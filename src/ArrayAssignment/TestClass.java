package ArrayAssignment;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
//        String for_things = "";
//        String _pieces = "";
//        String perUnit = "";
//        ArrayList<Integer> per_units = new ArrayList<>();
//        ArrayList<Integer> the_Pieces = new ArrayList<>();
//        ArrayList <String> things = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: " );
//
//       String name = scanner.next();
//        System.out.println("What did the user buy: ");
//        String thingsBought = scanner.next();

//       things.add(thingsBought);
////       String collect = String.valueOf(names);
//
//
//        System.out.println("How many pieces: ");
//        int pieces = scanner.nextInt();
//
//        System.out.println("How much per unit: ");
//        int per_unit = scanner.nextInt();
//
//        System.out.println("Add more Item ");
//        String yes = scanner.next();
//        for_things+=thingsBought;
//        _pieces+=pieces;
//        perUnit+=per_unit;
//        per_units.add(per_unit);
//        while (!Objects.equals(yes, "no")){
//            System.out.println("What did the user buy: ");
//             thingsBought = scanner.next();
//            System.out.println("How much per unit: ");
//             per_unit = scanner.nextInt();
//            System.out.println("how many pieces the user buy: ");
//            pieces = scanner.nextInt();
//            the_Pieces.add(pieces);
//            things.add(thingsBought);
//            _pieces+="\n"+pieces;
//            for_things+="\n"+thingsBought;
//            perUnit+="\n"+per_unit;
//            per_units.add(per_unit);
//            System.out.println("Add more ");
//            yes = scanner.next();
//        }
//
//        System.out.printf("""
//                            Item        QTY     Price
//
//                            %s\t\t\t %s\t\t\t%s
//
//                            """,for_things,_pieces,perUnit);

//        ArrayList <String> things = new ArrayList<>();
//
//        String thingsBought = scanner.next();
//        for (int i = 0; i <4 ; i++) {
//            System.out.println("What did the user buy: ");
//             thingsBought = scanner.next();
//            things.add(thingsBought);
//
//
//        }
//        for (int i = 0; i < things.size(); i++) {
//            System.out.print(things.get(i)+"\n");
//        }

//
//        for (int i = 0; i < 1; ) {
//
//
//          String food = String.valueOf(new ArrayList<>());
//            System.out.print("which food");
//            food  = scanner.next();
//
//            String news = String.valueOf(new ArrayList<>());
//            System.out.print("current news");
//            news = scanner.next();
//            String health = String.valueOf(new ArrayList<>());
//            System.out.print("your health");
//            health = scanner.next();
//
//            System.out.println("Add more ");
//            String addMore = scanner.next();
//          if (!Objects.equals(addMore, "no")){
//              System.out.print("food");
//              food  += scanner.next();
//
//
//              System.out.print("health");
//              health += scanner.next();
//
//              System.out.print("news");
//              news += scanner.next();
//              System.out.println("Add more ");
//              addMore = scanner.next();
//          }else {
//              i++;
//              System.out.printf("""
//                \t\t\tTesting Menu
//
//                %s\t\t\t\t\t\t %s\t\t\t\t\t\t%s
//                            """,news,food,health+"\n");
//          }
//          }







        StringBuilder news = new StringBuilder();
        StringBuilder food = new StringBuilder();
        StringBuilder health = new StringBuilder();

        boolean addMore = true;

        while (addMore) {
            System.out.print("Enter news: ");
            news.append(scanner.next()).append("\n");

            System.out.print("Enter food: ");
            food.append(scanner.next()).append("\n");

            System.out.print("Enter health: ");
            health.append(scanner.next()).append("\n");

            System.out.print("Add more entries? (yes/no): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                addMore = false;
            }
        }

        System.out.printf("""
                \t\t\tTesting Menu
                
                News:\t\t%-20sFood:\t\t%-20sHealth:\t%s
                """, news, food, health);

            }
        }

