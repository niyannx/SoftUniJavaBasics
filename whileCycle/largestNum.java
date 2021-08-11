package whileCycle;

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            Integer number = Integer.valueOf(input);
            if (number > max) {
                max = number;
            }
            input = scan.nextLine();
        }
        System.out.println(max);
    }
}
