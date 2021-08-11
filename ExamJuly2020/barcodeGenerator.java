package ExamJuly2020;

import java.util.Scanner;

public class barcodeGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        int f1 = first / 1000;
        int f2 = first / 100 % 10;
        int f3 = first / 10 % 10;
        int f4 = first % 10;

        int s1 = second / 1000;
        int s2 = second / 100 % 10;
        int s3 = second / 10 % 10;
        int s4 = second % 10;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i % 2 != 0 && i >= f1 && i <= s1) {
                            if (j % 2 != 0 && j >= f2 && j <= s2) {
                                if (k % 2 != 0 && k >= f3 && k <= s3) {
                                    if (l % 2 != 0 && l >= f4 && l <= s4) {
                                        System.out.printf("%d%d%d%d ", i, j, k, l);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
