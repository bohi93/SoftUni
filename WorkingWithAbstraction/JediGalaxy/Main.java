package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[][] galaxy = CreateGalaxy(dimestions[0],dimestions[1]);

            String command = scanner.nextLine();
            long sum = 0;
            while (!command.equals("Let the Force be with you"))
            {
                int[] ivoS = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
                int[] evil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int rowEvil = evil[0];
                int colEvil = evil[1];

                while (rowEvil >= 0 && colEvil >= 0)
                {
                    if (rowEvil < galaxy.length && colEvil < galaxy[0].length)
                    {
                        galaxy[rowEvil] [colEvil] = 0;
                    }
                    rowEvil--;
                    colEvil--;
                }

                int rowIvo = ivoS[0];
                int colIvo = ivoS[1];

                while (rowIvo >= 0 && colIvo < galaxy[1].length)
                {
                    if (rowIvo < galaxy.length && colIvo >= 0 && colIvo < galaxy[0].length)
                    {
                        sum += galaxy[rowIvo][colIvo];
                    }

                    colIvo++;
                    rowIvo--;
                }

                command = scanner.nextLine();
            }

        System.out.println(sum);


    }

    private static int[][] CreateGalaxy(int x, int y) {
        int[][] galaxy = new int[x][y];
        int value = 0;
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                galaxy[i][j] = value++;
            }
        }
        return galaxy;
    }
}
