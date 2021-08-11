package nestedLoops;

import java.util.Scanner;

public class safePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        int max = Integer.parseInt(scan.nextLine());

        int counter = 1;

        char A = 35;
        char B = 64;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                counter++;
                System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);

                A++;
                B++;

                if (A > 55) {
                    A = 35;
                }
                if (B > 96) {
                    B = 64;
                }
                if (counter > max) {
                    break;
                }
            }
            if (counter > max) {
                break;
            }
        }
    }
}
