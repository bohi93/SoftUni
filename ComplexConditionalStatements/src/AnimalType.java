import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        switch(input){
            case "dog":
                System.out.println("mammal");
                break;

            case "crocodile":
                System.out.println("reptile");
                break;

            case "tortoise":
                System.out.println("reptile");
                break;

            case "snake":
                System.out.println("reptile");
                break;

            default:
                System.out.println("unknown");
        }
    }
}
