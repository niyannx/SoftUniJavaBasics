package forCycle;

import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }

        }

        if (sumEven == sumOdd) {
            System.out.printf("Yes\nSum = %d", sumEven);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
