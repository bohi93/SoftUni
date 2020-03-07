import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine();
        double holidays = Double.parseDouble(scan.nextLine());
        double goHome = Double.parseDouble(scan.nextLine());
        double playableWeekends = 48;

        playableWeekends -= goHome;
        playableWeekends *= (3.0/4);
        holidays *= (2.0/3);
        playableWeekends += holidays + goHome;

        if(year.equals("leap")){
            double percentage = playableWeekends * 0.15;
            System.out.println(Math.floor(playableWeekends + percentage));
        }
        else{
            System.out.println(Math.floor(playableWeekends));
        }

    }
}
