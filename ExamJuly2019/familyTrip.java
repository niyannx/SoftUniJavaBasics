package ExamJuly2019;

import java.util.Scanner;

public class familyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double perNight = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        if (nights > 7) {
            perNight = perNight - perNight * 0.05;
        }
        double expenses;
        expenses = nights * perNight;
        expenses = expenses + budget * percent / 100;

        if (expenses > budget) {
            System.out.printf("%.2f leva needed.", Math.abs(expenses - budget));
        } else {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", Math.abs(expenses - budget));
        }
    }
}
