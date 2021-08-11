package nestedLoops;

import java.util.Scanner;

public class uniquePinCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());

        for (int firstNum = 1; firstNum <= n1; firstNum++) {
            for (int secondNum = 1; secondNum <= n2; secondNum++) {
                for (int thirdNum = 1; thirdNum <= n3; thirdNum++) {
                    if (firstNum % 2 == 0 && thirdNum % 2 == 0 && (secondNum == 2 || secondNum == 3 || secondNum == 5 || secondNum == 7)) {
                        System.out.printf("%d %d %d\n", firstNum, secondNum, thirdNum);
                    }
                }
            }
        }
    }
}
