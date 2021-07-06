package firstSteps;

import java.util.Scanner;

public class concetenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.println("You are " + firstName + " " + lastName + ", a " +  age + "-year old person from " + town + ".");
    }
}