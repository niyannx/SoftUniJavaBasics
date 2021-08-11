package conditionalStatements;

import java.util.Scanner;

public class pipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double pipes = (p1 + p2) * h;
        if (pipes <= v) {
            double pipesPercentage = (pipes / v) * 100;
            double p1Percentage = ((p1 * h) / pipes) * 100;
            double p2Percentage = ((p2 * h) / pipes) * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", pipesPercentage, p1Percentage, p2Percentage);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, pipes - v);
        }
    }
}
