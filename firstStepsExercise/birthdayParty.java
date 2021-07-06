package firstStepsExercise;

import java.util.Scanner;

public class birthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rent = Integer.parseInt(scan.nextLine());

        double cakeCost = rent * 0.20;
        double drinksCost = cakeCost - 0.45 * cakeCost;
        double animatorCost = rent / 3;

        double cost = rent + cakeCost + drinksCost + animatorCost;
        System.out.println(cost);
    }
}
