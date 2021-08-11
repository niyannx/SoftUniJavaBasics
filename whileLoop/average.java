package whileLoop;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double allNumbers = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());

            allNumbers = allNumbers + number;
        }
        double average = allNumbers / n;
        System.out.printf("%.2f", average);
    }
}
