import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for(String num : input){
            numbers.push(Integer.parseInt(num));
        }

        for(int num : numbers){
            System.out.print(num+" ");
        }
    }
}
