import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        type = type.toLowerCase();
        double rows = Double.parseDouble(scan.nextLine());
        double cols = Double.parseDouble(scan.nextLine());
        double total = rows * cols;

        switch(type){
            case "normal":
                total = total * 7.5;
                System.out.printf("%.2f",total);
                System.out.print(" leva");
                break;

            case "discount":
                total = total * 5;
                System.out.printf("%.2f",total);
                System.out.print(" leva");
                break;

            case "premiere":
                total = total * 12;
                System.out.printf("%.2f",total);
                System.out.print(" leva");
                break;
        }

    }
}
