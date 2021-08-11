package nestedLoopsExersise;

import java.util.Scanner;

public class specialNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean special = false;
        int n = Integer.parseInt(scan.nextLine());


        for (int first = 1; first <= 9; first++) {
            for (int second = 1; second <= 9; second++) {
                for (int third = 1; third <= 9; third++) {
                    for (int fourth = 1; fourth <= 9; fourth++) {
                        if (n % first == 0) {
                            if (n % second == 0) {
                                if (n % third == 0) {
                                    if (n % fourth == 0) {
                                        special = true;
                                    }
                                }
                            }
                        }
                        if (special) {
                            System.out.printf("%d%d%d%d ", first, second, third, fourth);
                        }
                        special = false;
                    }
                }
            }
        }
    }
}
