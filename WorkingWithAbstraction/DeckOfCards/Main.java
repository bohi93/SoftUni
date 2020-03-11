package deckOfCards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String power = scanner.nextLine();
        String suit = scanner.nextLine();

        PrintCard(power,suit);
    }

    private static void PrintCard(String power, String suit) {
        int cardPower = Suits.valueOf(suit).getValue() + Powers.valueOf(power).getValue();

        System.out.printf("Card name: %s of %s; Card power: %d",power,suit,cardPower);
    }
}
