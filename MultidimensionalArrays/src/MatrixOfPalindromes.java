import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix;
        int[] dimentions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        matrix = fillMatrix(dimentions[0],dimentions[1]);
        printMatrix(matrix);

    }
    public static String[][] fillMatrix(int rows, int cols){
        String[][] matrix = new String[rows][cols];
        String inputText;
        char first = 'a';
        char second = 'a';
        char third = 'a';
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                inputText = "" + first + second + third;
                matrix[row][col] = inputText;
                second++;
            }
            first++;
            third++;
            second = first;
        }
        return matrix;
    }

    public static void printMatrix(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for(String row : matrix[i]){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
