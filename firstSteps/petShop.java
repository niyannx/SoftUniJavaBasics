package firstSteps;

import java.util.*;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = scanner.nextInt();
        int animals = scanner.nextInt();

        double costForDogs = dogs * 2.50;
        double costForAnimals = animals * 4;
        double cost = (costForAnimals + costForDogs);
        System.out.println(cost + " lv.");
    }
}
