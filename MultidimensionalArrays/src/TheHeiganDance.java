import java.util.HashMap;
import java.util.Scanner;

public class TheHeiganDance {
    private static HashMap<String, Integer> damagePos;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerHP = 18500;
        double heiganHP = 3000000;
        boolean isPlayerHit = false;
        boolean isPlayerPoisoned = false;
        int[] playerPos = {7,7};
        String causeOfDeath = "";

        double playerDMG = Double.parseDouble(scanner.nextLine());

        while (true){
            String[] attack = scanner.nextLine().split(" ");
            heiganHP -= playerDMG;

            int atkRow = Integer.parseInt(attack[1]);
            int atkCol = Integer.parseInt(attack[2]);

            if(isPlayerPoisoned){
                playerHP -= 3500;
                isPlayerPoisoned = false;
                causeOfDeath = "Plague Cloud";
            }

            if(playerHP <= 0 || heiganHP <= 0){
                break;
            }

            getDamageArea(atkRow,atkCol);
            if(isPlayerInDamageZone(playerPos)){
                if(playerPos[0] > 0 && playerPos[0] == damagePos.get("minRow")) {
                    playerPos[0]--;
                }else if(playerPos[0] < 14 && playerPos[0] == damagePos.get("maxRow")) {
                    playerPos[0]++;
                }else if (playerPos[1] > 0 && playerPos[1] == damagePos.get("minCol")) {
                    playerPos[1]--;
                } else if (playerPos[1] < 14 && playerPos[1] == damagePos.get("maxCol")) {
                    playerPos[1]++;
                }
            }
            if(isPlayerInDamageZone(playerPos)){
                if(attack[0].equals("Cloud")){
                    playerHP -= 3500;
                    isPlayerPoisoned = true;
                    causeOfDeath = "Plague Cloud";
                }else{
                    playerHP -= 6000;
                    causeOfDeath = "Eruption";
                }
            }

            if(playerHP <= 0){
                break;
            }
        }

        if (heiganHP <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f\n", heiganHP);
        }

        if (playerHP <= 0) {
            System.out.println("Player: Killed by " + causeOfDeath);
        } else {
            System.out.println("Player: " + playerHP);
        }

        System.out.printf("Final position: %d, %d", playerPos[0], playerPos[1]);
    }

    private static void getDamageArea(int row, int col) {
        damagePos = new HashMap<>();
        damagePos.put("minRow", row - 1);
        damagePos.put("maxRow", row + 1);
        damagePos.put("minCol", col - 1);
        damagePos.put("maxCol", col + 1);
    }

    private static boolean isPlayerInDamageZone(int[] playerPosition) {
        boolean isInHitRow = playerPosition[0] >= damagePos.get("minRow") &&
                playerPosition[0] <= damagePos.get("maxRow");
        boolean isInHitCol = playerPosition[1] >= damagePos.get("minCol") &&
                playerPosition[1] <= damagePos.get("maxCol");
        return isInHitRow && isInHitCol;
    }
}