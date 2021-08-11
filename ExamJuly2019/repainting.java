package ExamJuly2019;

import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int diluent = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double nylonPrice = 1.5;
        double paintPrice = 14.5;
        double diluentPrice = 5;

        double allExpenses;
        allExpenses = (paint + paint * 0.1) * paintPrice;
        allExpenses = allExpenses + (nylon + 2) * nylonPrice;
        allExpenses = allExpenses + 0.4 + diluent * diluentPrice;
        allExpenses = allExpenses + (allExpenses * 0.3) * hours;

        System.out.printf("Total expenses : %.2f lv.", allExpenses);

    }
}
