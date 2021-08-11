package nestedLoops;

import java.util.Scanner;

public class carNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int one = start; one <= end; one++) {
            for (int two = start; two <= end; two++) {
                for (int three = start; three <= end; three++) {
                    for (int four = start; four <= end; four++) {
                        if (((one % 2 == 0 && four % 2 != 0) || (one % 2 != 0 && four % 2 == 0)) && one > four && (two + three) % 2 == 0) {
                            System.out.printf("%d%d%d%d ", one, two, three, four);
                        }
                    }
                }
            }
        }
    }
}
