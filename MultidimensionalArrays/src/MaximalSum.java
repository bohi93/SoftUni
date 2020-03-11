import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimentions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[dimentions[0]][dimentions[1]];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        maximalSum(matrix);
    }
    public static void maximalSum(int[][] matrix){
        int[][] tempMatrix = new int[3][3];
        int[][] biggestMatrix = new int[3][3];
        int sum = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        tempMatrix[i][j] = matrix[row + i][col + j];
                    }
                }
                int tempSum = sumMatrix(tempMatrix);
                if(tempSum > sum){
                    for(int i=0; i<biggestMatrix.length; i++){
                        for(int j=0; j<biggestMatrix[i].length; j++){
                            biggestMatrix[i][j]=tempMatrix[i][j];
                        }
                    }

                    sum = tempSum;
                }
            }
        }
        print(biggestMatrix,sum);
    }

    public static int sumMatrix(int[][] newMatrix){
        int sum = 0;

        for (int i = 0; i < newMatrix.length; i++) {
            for(int num : newMatrix[i]){
                sum += num;
            }
        }

        return sum;
    }

    public static void print(int[][] matrix, int sum){
        System.out.println("Sum = " + sum);
        for (int i = 0; i < matrix.length; i++) {
            for(int row : matrix[i]){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
