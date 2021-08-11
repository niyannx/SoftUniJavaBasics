package nestedLoops;

import java.util.Scanner;

public class theSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = Integer.parseInt(scan.nextLine());
        int counter = 0;
        int password = 0;
        if (m >= 4 && m <= 144) {
            for (int a = 1; a <= 9; a++) {
                for (int b = 1; b <= 9; b++) {
                    for (int c = 1; c <= 9; c++) {
                        for (int d = 1; d <= 9; d++) {
                            if (a * b + c * d == m && a < b && c > d) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                counter++;
                                if (counter == 4) {
                                    password = a * 1000 + b * 100 + c * 10 + d;
                                }
                            }
                        }
                    }
                }
            }
            if (counter < 4) {
                System.out.print("\nNo!");
            } else {
                System.out.printf("\nPassword: %d", password);
            }
        }
    }
}
