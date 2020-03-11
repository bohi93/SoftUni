import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(", ");
        int num = Integer.parseInt(commands[0]);
        int[][] matrix;

        switch (commands[1].toLowerCase()){
            case "a":
                matrix = patternA(num);
                printMetrix(matrix);
                break;
            case "b":
                matrix = patternB(num);
                printMetrix(matrix);
                break;
        }
    }
    private static int[][] patternA(int num){
        int[][] matrix = new int[num][num];
        int filler = 1;
        for (int j = 0; j < num; j++) {
            for (int i = 0; i < num; i++) {
                matrix[i][j] = filler;
                filler++;
            }
        }
        return matrix;
    }

    private static int[][] patternB(int num){
        int[][] matrix = new int[num][num];
        int filler = 1;
        for (int j = 0; j < num; j++) {
            if(j % 2 == 0){
                for (int i = 0; i < num; i++) {
                    matrix[i][j] = filler;
                    filler++;
                }
            }else{
                for (int i = num - 1; i >= 0; i--) {
                    matrix[i][j] = filler;
                    filler++;
                }
            }
        }
        return matrix;
    }

    private static void printMetrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
