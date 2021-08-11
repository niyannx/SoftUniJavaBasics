package nestedLoops;

import java.util.Scanner;

public class primePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstPair = Integer.parseInt(scan.nextLine());
        int secondPair = Integer.parseInt(scan.nextLine());
        int difference1 = Integer.parseInt(scan.nextLine());
        int difference2 = Integer.parseInt(scan.nextLine());

        boolean aIsPrime = false;
        boolean bIsPrime = false;

        for (int a = firstPair; a <= firstPair + difference1; a++) {
            for (int b = secondPair; b <= secondPair + difference2; b++) {

                int i, counter = 0;

                for (i = 2; i <= a / 2; i++) {
                    if (a % i == 0) {
                        aIsPrime = false;
                        counter = 1;
                        break;
                    }
                    if (counter == 0 && a > 0) {
                        aIsPrime = true;
                    }
                }
                counter = 0;

                for (i = 2; i <= b / 2; i++) {
                    if (b % i == 0) {
                        bIsPrime = false;
                        counter = 1;
                        break;
                    }
                    if (counter == 0 && a > 0) {
                        bIsPrime = true;
                    }
                }
                boolean arePrime = aIsPrime && bIsPrime;

                if (arePrime) {
                    System.out.printf("%d%d\n", a, b);
                }
            }
        }
    }
}