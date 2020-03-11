import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimentions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[dimentions[0]][dimentions[1]];

        for (int i = 0; i < matrix.length; i++) {
            String[] arr = scanner.nextLine().split(" ");
            matrix[i] = arr;
        }
        String input = scanner.nextLine();

        while(!input.equals("END")){
            String[] arr = input.split(" ");

            if(!arr[0].equals("swap")){
                System.out.println("Invalid inout!");
            }else{
                int row1 = Integer.parseInt(arr[1]);
                int col1 = Integer.parseInt(arr[2]);
                int row2 = Integer.parseInt(arr[3]);
                int col2 = Integer.parseInt(arr[4]);

                if(row1 > dimentions[0] || row2 > dimentions[0] || col1 > dimentions[1] || col2 > dimentions[1]){
                    System.out.println("Invalid inout!");
                }else{
                    matrix = swapMatrix(matrix,row1,col1,row2,col2);
                    print(matrix);
                }
            }
            input = scanner.nextLine();
        }
    }
    public static String[][] swapMatrix(String[][] matrix,int row1,int col1,int row2,int col2){
        String temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;

        return matrix;
    }

    public static void print(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for(String row : matrix[i]){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
