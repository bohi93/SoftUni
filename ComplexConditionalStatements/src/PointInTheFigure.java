import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        boolean insideFigure1 = (x > 0) && (x < 3 * h) && (y > 0) && (y < h);
        boolean insideFigure2 = (x > h) && (x < 2 * h) && (y > h) && (y < 4 * h);
        boolean insideBorder = (x > h) && (x < 2 * h) && (y == h);

        boolean onBottomF1 = (0 <= x) && (x <= 3 * h) && (y == 0);
        boolean onLeftSideF1 = (x == 0) && (y >= 0) && (y <= h);
        boolean onRightSideF1 = (x == 3 * h) && (y >= 0) && (y <= h);
        boolean onTopSideF1WithoutInsideBorder = ((x >= 0) && (x <= h) && (y == h) || (x >= 2 * h) && (x <= 3 * h) && (y == h));

        boolean onLeftSideF2 = (x == h) && (y >= h) && (y <= 4 * h);
        boolean onRightSideF2 = (x == 2 * h) && (y >= h) && (y <= 4 * h);
        boolean onTopSideF2 = (x >= h) && (x <= 2 * h) && (y == 4 * h);


        if ((insideFigure1) || (insideFigure2) || (insideBorder))
        {
            System.out.println("Inside");
        }
        else if ((onBottomF1) || (onLeftSideF1) || (onRightSideF1) || (onTopSideF1WithoutInsideBorder) || (onLeftSideF2) || (onRightSideF2) || (onTopSideF2))
        {
            System.out.println("border");
        }
        else
        {
            System.out.println("outside");
        }
    }
}
