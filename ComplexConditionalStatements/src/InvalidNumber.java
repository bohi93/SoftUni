import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        boolean zero = number == 0;

        if((100 <= number) && (number <= 200) || zero){

        }
        else {
            System.out.println("invalid");
        }
    }
}
