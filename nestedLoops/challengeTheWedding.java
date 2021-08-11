package nestedLoops;

import java.util.Scanner;

public class challengeTheWedding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int men = Integer.parseInt(scan.nextLine());
        int women = Integer.parseInt(scan.nextLine());
        int tables = Integer.parseInt(scan.nextLine());
        int counter = 0;

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                counter++;
                if (counter > tables) {
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
            }
        }
    }
}
