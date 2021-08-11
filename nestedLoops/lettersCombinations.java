package nestedLoops;

import java.util.Scanner;

public class lettersCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char start = scan.next().charAt(0);
        char finish = scan.next().charAt(0);
        char noInclude = scan.next().charAt(0);
        int counter = 0;

        for (char i = start; i <= finish; i++) {
            for (char j = start; j <= finish; j++) {
                for (char k = start; k <= finish; k++) {
                    if (i != noInclude && j != noInclude && k != noInclude) {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }
        System.out.printf("%d", counter);
    }
}
