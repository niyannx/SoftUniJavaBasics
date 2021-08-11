package ExamMarch2020;

import java.util.Scanner;

public class foodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double amountFood = Double.parseDouble(scan.nextLine());

        int biscuits = 0;
        double catEaten = 0;
        double dogEaten = 0;
        double allFood = 0;

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            int dog = Integer.parseInt(scan.nextLine());
            int cat = Integer.parseInt(scan.nextLine());

            allFood = allFood + dog + cat;
            catEaten = catEaten + cat;
            dogEaten = dogEaten + dog;

            if (currentDay % 3 == 0) {
                biscuits = (int) (biscuits + Math.round((dog + cat) * 0.1));
            }
        }
        System.out.printf("Total eaten biscuits: %dgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", allFood / amountFood * 100);
        System.out.printf("%.2f%% eaten from the dog.\n", dogEaten / allFood * 100);
        System.out.printf("%.2f%% eaten from the cat.\n", catEaten / allFood * 100);
    }
}
