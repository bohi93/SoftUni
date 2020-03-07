import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean firstOption = x == x1 || x == x2;
        boolean secondOption = y == y1 || y == y2;
        boolean sideX = x1 <= x && x <= x2;
        boolean sideY = y1 <= y && y <= y2;

        if(sideX && sideY){
            if(firstOption || secondOption){
                System.out.println("Border");
            }
            else {
                System.out.println("Inside / Outside");
            }
        }
        else {
            System.out.println("Inside / Outside");
        }


    }
}
