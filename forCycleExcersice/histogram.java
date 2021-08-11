package forCycleExcersice;

import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double diapason1 = 0, diapason2 = 0, diapason3 = 0, diapason4 = 0, diapason5 = 0;


        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (num < 200) {
                diapason1 = diapason1 + 1;
            } else if (num < 400) {
                diapason2 = diapason2 + 1;
            } else if (num < 600) {
                diapason3 = diapason3 + 1;
            } else if (num < 800) {
                diapason4 = diapason4 + 1;
            } else {
                diapason5 = diapason5 + 1;
            }
        }
        diapason1 = diapason1 / n * 100;
        diapason2 = diapason2 / n * 100;
        diapason3 = diapason3 / n * 100;
        diapason4 = diapason4 / n * 100;
        diapason5 = diapason5 / n * 100;
        System.out.printf("%.2f%%\n", diapason1);
        System.out.printf("%.2f%%\n", diapason2);
        System.out.printf("%.2f%%\n", diapason3);
        System.out.printf("%.2f%%\n", diapason4);
        System.out.printf("%.2f%%", diapason5);
    }
}
