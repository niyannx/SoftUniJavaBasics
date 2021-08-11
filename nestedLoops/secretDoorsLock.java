package nestedLoops;

import java.util.Scanner;

public class secretDoorsLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hundred = Integer.parseInt(scan.nextLine());
        int ten = Integer.parseInt(scan.nextLine());
        int one = Integer.parseInt(scan.nextLine());

        for (int first = 1; first <= hundred; first++) {
            for (int second = 1; second <= ten; second++) {
                for (int third = 1; third <= one; third++) {
                    if (first % 2 == 0 && third % 2 == 0) {
                        if (second == 2 || second == 3 || second == 5 || second == 7) {
                            System.out.printf("%d %d %d\n", first, second, third);
                        }
                    }
                }
            }
        }
    }
}
