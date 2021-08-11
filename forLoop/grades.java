package forLoop;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = Integer.parseInt(scan.nextLine());
        double average = 0;
        double excellent = 0;
        double good = 0;
        double okay = 0;
        double fail = 0;

        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            average = average + grade;
            if (grade >= 5) {
                excellent++;
            } else if (grade >= 4) {
                good++;
            } else if (grade >= 3) {
                okay++;
            } else {
                fail++;
            }

        }
        excellent = excellent / students * 100;
        good = good / students * 100;
        okay = okay / students * 100;
        fail = fail / students * 100;
        average = average / students;

        System.out.printf("Top students: %.2f%%\n", excellent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", good);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", okay);
        System.out.printf("Fail: %.2f%%\n", fail);
        System.out.printf("Average: %.2f\n", average);
    }
}
