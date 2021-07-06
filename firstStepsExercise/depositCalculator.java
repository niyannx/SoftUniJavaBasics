package firstStepsExercise;

import java.util.Scanner;

public class depositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depositAmount = Double.parseDouble(scan.nextLine());
        int depositTerm = Integer.parseInt(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());


        double sum = depositAmount + depositTerm * ((depositAmount * interestRate / 100) / 12);
        System.out.println(sum);
    }
}
