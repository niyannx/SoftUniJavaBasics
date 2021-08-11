package forCycleExcersice;

import java.util.Scanner;

public class oddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double sumOdd = 0;
        double sumEven = 0;
        double maxOdd = -555555555;
        double maxEven = -555555555;
        double minOdd = 555555555;
        double minEven = 555555555;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                sumEven += number;
                if (number > maxEven) {
                    maxEven = number;
                } if (number < minEven) {
                    minEven = number;
                }
            } else {
                sumOdd += number;
                if (number > maxOdd) {
                    maxOdd = number;
                } if (number < minOdd) {
                    minOdd = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,\n", sumOdd);
        if (minOdd != 555555555) {
            System.out.printf("OddMin=%.2f,\n", minOdd);
        } else {System.out.println("OddMin=No,");}
        if (maxOdd != -555555555 ) {
            System.out.printf("OddMax=%.2f,\n", maxOdd);
        } else { System.out.println("OddMax=No,"); }
        System.out.printf("EvenSum=%.2f,\n", sumEven);
        if (minEven != 555555555) {
            System.out.printf("EvenMin=%.2f,\n", minEven);
        } else { System.out.println("EvenMin=No,"); }
        if (maxEven != -555555555 ) {
            System.out.printf("EvenMax=%.2f\n", maxEven);
        } else { System.out.println("EvenMax=No"); }
    }
}