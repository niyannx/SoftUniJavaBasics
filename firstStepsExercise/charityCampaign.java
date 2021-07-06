package firstStepsExercise;

import java.util.Scanner;

public class charityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int chefs = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double sum = ((cakes * 45 + waffles * 5.8 + pancakes * 3.2) * chefs) * days;
        double finalsum = sum - (sum / 8);

        System.out.println(finalsum);
    }
}
