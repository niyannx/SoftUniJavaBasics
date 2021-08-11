package forCycle;

import java.util.Scanner;

public class numSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < smallest) {
                smallest = num;
            }
            if (num > biggest) {
                biggest = num;
            }
        }
        System.out.printf("Max number: %d\n", biggest);
        System.out.printf("Min number: %d", smallest);
    }
}
