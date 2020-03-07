import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());

        if(city.equals("Sofia")){
            switch(product){
                case "coffee":
                    System.out.println(price * 0.50);
                    break;

                case "water":
                    System.out.println(price * 0.80);
                    break;

                case "beer":
                    System.out.println(price * 1.20);
                    break;

                case "sweets":
                    System.out.println(price * 1.45);
                    break;

                case "peanuts":
                    System.out.println(price * 1.60);
                    break;
            }
        }
        else if(city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    System.out.println(price * 0.40);
                    break;

                case "water":
                    System.out.println(price * 0.70);
                    break;

                case "beer":
                    System.out.println(price * 1.15);
                    break;

                case "sweets":
                    System.out.println(price * 1.30);
                    break;

                case "peanuts":
                    System.out.println(price * 1.50);
                    break;
            }
        }
        else if(city.equals("Varna")){
            switch(product){
                case "coffee":
                    System.out.println(price * 0.45);
                    break;

                case "water":
                    System.out.println(price * 0.70);
                    break;

                case "beer":
                    System.out.println(price * 1.10);
                    break;

                case "sweets":
                    System.out.println(price * 1.35);
                    break;

                case "peanuts":
                    System.out.println(price * 1.55);
                    break;
            }

        }
    }
}
