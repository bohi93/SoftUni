import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double x1 = Double.parseDouble(scan.nextLine());
        Double y1 = Double.parseDouble(scan.nextLine());
        Double x2 = Double.parseDouble(scan.nextLine());
        Double y2 = Double.parseDouble(scan.nextLine());
        Double x = Double.parseDouble(scan.nextLine());
        Double y = Double.parseDouble(scan.nextLine());

        if(x1 <= x && x <= x2){
            if(y1 <= y && y <= y2){
                System.out.println("Inside");
            }
            else {
                System.out.println("Outside");
            }
        }
        else {
            System.out.println("Outside");
        }
    }
}
