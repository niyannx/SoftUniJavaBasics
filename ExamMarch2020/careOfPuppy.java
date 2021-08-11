package ExamMarch2020;

import java.util.Scanner;

public class careOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int food = Integer.parseInt(scan.nextLine());
        food = food * 1000;
        int foodEaten = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Adopted")) {
                break;
            }

            int grams = Integer.parseInt(input);
            foodEaten = foodEaten + grams;
        }
        if (foodEaten > food) {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(food - foodEaten));
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", Math.abs(food - foodEaten));
        }
    }
}
