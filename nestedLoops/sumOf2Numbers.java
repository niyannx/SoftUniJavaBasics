package nestedLoops;

import java.util.Scanner;

public class sumOf2Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int beginInterval = Integer.parseInt(scan.nextLine());
        int endInterval = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int counter = 0;

        for (int i = beginInterval; i <= endInterval; i++) {
            for (int j = beginInterval; j <= endInterval; j++) {
                counter++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d ", counter);
                    System.out.printf("(%d + %d = %d)", i, j, magicNum);
                    return;
                }

                if (i == endInterval && j == endInterval) {
                    System.out.printf("%d combinations - neither equals %d", counter, magicNum);
                }
            }
        }
    }
}
