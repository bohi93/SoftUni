import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("[()]+");
        int angle = Integer.parseInt(data[1]) % 360;
        ArrayList<String> inputString = new ArrayList<>();
        String input = scanner.nextLine();
        int maxLength = input.length();

        while(!input.equals("END")){
            inputString.add(input);
            input = scanner.nextLine();
            if(maxLength < input.length()){
                maxLength = input.length();
            }
        }

        char[][] matrix = new char[inputString.size()][maxLength];

        for (int r = 0; r < inputString.size(); r++) {
            for (int c = 0; c < maxLength; c++) {
                if(c > inputString.get(r).length()-1){
                    matrix[r][c] = ' ';
                }else{
                    matrix[r][c] = inputString.get(r).charAt(c);
                }
            }
        }

        if(angle == 90){
            for (int c = 0; c < maxLength; c++) {
                for (int r = matrix.length - 1; r >= 0; r--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }else if(angle == 180){
            for (int r = matrix.length - 1; r >= 0; r--) {
                for (int c = maxLength - 1; c >= 0; c--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }else if(angle == 270){
            for (int c = maxLength - 1; c >= 0; c--) {
                for (int r = 0; r < matrix.length; r++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }else{
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < maxLength; c++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }
    }
}
