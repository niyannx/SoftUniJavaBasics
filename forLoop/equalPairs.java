package forLoop;

import java.util.Scanner;

public class equalPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        int diff = 0;
        boolean areTheSumsEqual = true;

        for (int i = 1; i <= n; i++) {
            int numberOne = Integer.parseInt(scan.nextLine());
            int numberTwo = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0) {
                evenSum = numberOne + numberTwo;
            } else {
                oddSum = numberTwo + numberOne;
            }
            if (i > 1 && Math.abs(evenSum - oddSum) > diff) {
                diff = Math.abs(evenSum - oddSum);
                areTheSumsEqual = false;
            }
        }
        if (areTheSumsEqual) {
            System.out.printf("Yes, value=%d", oddSum);
        } else {
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}
