import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[size[0]][size[1]];

        for (int i = 0; i < size[0]; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < size[1]; j++) {
                matrix[i][j] = arr[j];
            }
        }
        printDiagonal(matrix,size[0],size[1]);
    }

    public static void printDiagonal(int[][] matrix,int rows,int cols){
        int row = rows - 1;
        int col = cols - 1;
        while (row != -1){
            int c = col;
            int r = row;

            while (c < cols && r >= 0){
                System.out.print(matrix[r--][c++] + " ");
            }
            System.out.println();
            col--;

            if(col == -1){
                col = 0;
                row--;
            }
        }
    }
}