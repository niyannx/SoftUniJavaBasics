package nestedLoops;

import java.util.Scanner;

public class building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());
        String type;

        for (int i = floors; i >= 0; i--) {
            for (int j = 0; j < rooms; j++) {
                if (i == floors) {
                    type = "L";
                } else if (i % 2 == 0) {
                    type = "O";
                } else {
                    type = "A";
                }
                if (i != 0) {
                    System.out.printf("%s%d%d", type, i, j);
                }
                if (j < rooms - 1 && i != 0) {
                    System.out.print(" ");
                }
                if (j == rooms - 1 && i != 0) {
                    System.out.println();
                }
            }
        }
    }
}
