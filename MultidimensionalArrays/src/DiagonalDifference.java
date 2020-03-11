import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        diagonalSum(matrix);

    }
    public static void diagonalSum(int[][] matrix){
        int sumOne = 0;
        int sumTwo = 0;
        int step = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumOne += matrix[i][step];
            step++;
        }
        step--;
        for (int i = 0; i < matrix.length; i++) {
            sumTwo += matrix[i][step];
            step--;
        }

        if(sumOne > sumTwo){
            System.out.println(sumOne - sumTwo);
        }else{
            System.out.println(sumTwo - sumOne);
        }
    }
}
