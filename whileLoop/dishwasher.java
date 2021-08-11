package whileLoop;

import java.util.Scanner;

public class dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bottles = Integer.parseInt(scan.nextLine());
        int mlDetergent = bottles * 750;
        String input = scan.nextLine();
        int counter = 0;
        int mlUsed = 0;
        int washedDishes = 0;
        int washedPots = 0;

        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            counter++;

            if (counter % 3 == 0) {
                mlUsed = mlUsed + dishes * 15;
                washedPots = washedPots + dishes;
            } else {
                mlUsed = mlUsed + dishes * 5;
                washedDishes = washedDishes + dishes;
            }
            if (mlDetergent - mlUsed < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(mlDetergent - mlUsed));
                break;
            }
            input = scan.nextLine();
        }
        if (mlDetergent - mlUsed >= 0) {
            System.out.printf("Detergent was enough!\n%d dishes and %d pots were washed.\nLeftover detergent %d ml.", washedDishes, washedPots, Math.abs(mlDetergent - mlUsed));
        }
    }
}
