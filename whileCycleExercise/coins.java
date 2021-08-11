package whileCycleExercise;

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = Double.parseDouble(scan.nextLine());
        int coins = 0;
        input = Math.floor(input * 100);

        while (input > 0) {
            if (input >= 200) {
                coins++;
                input -= 200;
            } else if (input >= 100) {
                coins++;
                input -= 100;
            } else if (input >= 50) {
                coins++;
                input -= 50;
            } else if (input >= 20) {
                coins++;
                input -= 20;
            } else if (input >= 10) {
                coins++;
                input -= 10;
            } else if (input >= 5) {
                coins++;
                input -= 5;
            } else if (input >= 2) {
                coins++;
                input -= 2;
            } else if (input >= 1) {
                coins++;
                input -= 1;
            }
        }
        System.out.println(coins);
    }
}
