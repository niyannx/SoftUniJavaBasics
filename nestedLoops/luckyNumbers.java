package nestedLoops;

import java.util.Scanner;

public class luckyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int first = 1; first <= 9; first++) {
            for (int second = 1; second <= 9; second++) {
                for (int third = 1; third <= 9; third++) {
                    for (int fourth = 1; fourth <= 9; fourth++) {
                        if ((first + second == third + fourth) && n % (first + second) == 0) {
                            System.out.printf("%d%d%d%d ", first, second, third, fourth);
                        }
                    }
                }
            }
        }
    }
}
