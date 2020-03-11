import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> input = new ArrayDeque<>();
        int[] instructions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .limit(instructions[0])
                .forEach(input::push);

        for(int i = 0; i < instructions[1];i++){
            input.pop();
        }

        if(input.contains(instructions[2])){
            System.out.println(true);
        }else{
            int minNum = Integer.MAX_VALUE;

            if(input.isEmpty()){
                minNum = 0;
            }

            while (!input.isEmpty()){
                int current = input.pop();
                if(current < minNum){
                    minNum = current;
                }
            }
            System.out.println(minNum);
        }
    }
}
