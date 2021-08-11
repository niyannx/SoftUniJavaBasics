package conditionalStatements;

import java.util.Scanner;

public class sleepyCatTom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int timeForPlay = (365 - days) * 63 + days * 127;

        if (30000 > timeForPlay) {
        int hours = (30000 - timeForPlay) / 60;
        int minutes = (30000 - timeForPlay) % 60;
            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play", hours, minutes);
        } else {
            int hours = (timeForPlay - 30000) / 60;
            int minutes = (timeForPlay - 30000) % 60;
            System.out.printf("Tom will run away\n%d hours and %d minutes more for play", hours, minutes);
        }
    }
}
