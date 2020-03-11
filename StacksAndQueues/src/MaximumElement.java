import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        String[] input;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < lines; i++){
            input = scanner.nextLine().split(" ");

            switch (input[0]){
                case "1":
                    int num = Integer.parseInt((input[1]));
                    stack.push(num);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int maxNum = Collections.max(stack);
                    System.out.println(maxNum);
                    break;
            }
        }
    }
}
