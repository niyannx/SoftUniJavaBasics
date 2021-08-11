package nestedLoops;

import java.util.Scanner;

public class weddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char lastSector = scan.nextLine().charAt(0);
        int rows = Integer.parseInt(scan.nextLine());
        int seatsOdd = Integer.parseInt(scan.nextLine());

        int factor;
        int counter = 0;

        for (char i = 'A'; i <= lastSector; i++, rows++) {
            for (int j = 1; j <= rows; j++) {
                factor = (j % 2 == 0) ? 2 : 0;
                for (char k = 'a'; k < 'a' + seatsOdd + factor; k++) {
                    System.out.printf("%c%d%c%n", i, j, k);
                    counter++;
                }
            }
        }
        System.out.printf("%d", counter);
    }
}
