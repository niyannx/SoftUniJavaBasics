package nestedLoops;

import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount1 = Integer.parseInt(scan.nextLine());
        int amount2 = Integer.parseInt(scan.nextLine());
        int amount5 = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());

        for (int oneLevs = 0; oneLevs <= amount1; oneLevs++) {
            for (int twoLevs = 0; twoLevs <= amount2; twoLevs++) {
                for (int fiveLevs = 0; fiveLevs <= amount5; fiveLevs++) {
                    if (oneLevs + twoLevs * 2 + fiveLevs * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", oneLevs, twoLevs, fiveLevs, sum);
                    }
                }
            }
        }
    }
}
