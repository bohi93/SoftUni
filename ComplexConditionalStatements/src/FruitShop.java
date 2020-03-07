import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double count = Double.parseDouble(scan.nextLine());
        double price;
        boolean halfWeek = day.equals("Monday") ||  day.equals("Tuesday") || day.equals("Wednesday");
        boolean otherHalfWeek = day.equals("Thursday") || day.equals("Friday");

        if(day.equals("Saturday") || day.equals("Sunday")){
            switch (fruit){
                case "banana":
                    price = 2.70 * count;
                    System.out.printf("%.2f",price);
                    break;

                case "apple":
                    price = 1.25 * count;
                    System.out.printf("%.2f",price);
                    break;

                case "orange":
                    price = 0.90 * count;
                    System.out.printf("%.2f",price);
                    break;

                case "grapefruit":
                    price = 1.60 * count;
                    System.out.printf("%.2f",price);
                    break;

                case "kiwi":
                    price = 3.00 * count;
                    System.out.printf("%.2f",price);
                    break;

                case "pineapple":
                    price = 5.60 * count;
                    System.out.printf("%.2f",price);
                    break;

                case "grapes":
                    price = 4.20 * count;
                    System.out.printf("%.2f",price);
                    break;

                default:
                    System.out.println("error");
            }
        }
        else if (halfWeek || otherHalfWeek){
            switch (fruit) {
                case "banana":
                    price = 2.50 * count;
                    System.out.printf("%.2f", price);
                    break;

                case "apple":
                    price = 1.20 * count;
                    System.out.printf("%.2f", price);
                    break;

                case "orange":
                    price = 0.85 * count;
                    System.out.printf("%.2f", price);
                    break;

                case "grapefruit":
                    price = 1.45 * count;
                    System.out.printf("%.2f", price);
                    break;

                case "kiwi":
                    price = 2.70 * count;
                    System.out.printf("%.2f", price);
                    break;

                case "pineapple":
                    price = 5.50 * count;
                    System.out.printf("%.2f", price);
                    break;

                case "grapes":
                    price = 3.85 * count;
                    System.out.printf("%.2f", price);
                    break;

                default:
                    System.out.println("error");
            }

        }
        else {
            System.out.println("error");
        }
    }
}
