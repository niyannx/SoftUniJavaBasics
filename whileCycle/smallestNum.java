package whileCycle;

import java.util.Scanner;

public class smallestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            Integer number = Integer.valueOf(input);
            if (number < min) {
                min = number;
            }
            input = scan.nextLine();
        }
        System.out.println(min);
    }
}
