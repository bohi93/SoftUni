import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double money = Double.parseDouble(scan.nextLine());
        city.toLowerCase();
        boolean small = 0 <= money && money <= 500;
        boolean ok = 500 <= money && money <= 1000;
        boolean good = 1000 <= money && money <= 10000;
        boolean excelent = money > 10000;

        switch (city){
            case "Sofia":
                if(small){
                    money = money * 0.05;
                    System.out.printf("%.2f",money);
                }
                else if(ok){
                    money = money * 0.07;
                    System.out.printf("%.2f",money);
                }
                else if (good){
                    money = money * 0.08;
                    System.out.printf("%.2f",money);
                }
                else if(excelent){
                    money = money * 0.12;
                    System.out.printf("%.2f",money);
                }
                else{
                    System.out.println("error");
                }
                break;

            case "Varna":
                if(small){
                    money = money * 0.045;
                    System.out.printf("%.2f",money);
                }
                else if(ok){
                    money = money * 0.075;
                    System.out.printf("%.2f",money);
                }
                else if (good){
                    money = money * 0.1;
                    System.out.printf("%.2f",money);
                }
                else if(excelent){
                    money = money * 0.13;
                    System.out.printf("%.2f",money);
                }
                else{
                    System.out.println("error");
                }
                break;

            case "Plovdiv":
                if(small){
                    money = money * 0.055;
                    System.out.printf("%.2f",money);
                }
                else if(ok){
                    money = money * 0.08;
                    System.out.printf("%.2f",money);
                }
                else if (good){
                    money = money * 0.12;
                    System.out.printf("%.2f",money);
                }
                else if(excelent){
                    money = money * 0.145;
                    System.out.printf("%.2f",money);
                }
                else{
                    System.out.println("error");
                }
                break;

            default:
                System.out.println("error");
        }

    }
}
