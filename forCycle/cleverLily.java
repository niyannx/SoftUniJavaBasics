package forCycle;

import java.util.Scanner;

public class cleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int birthdays = Integer.parseInt(scan.nextLine());
        int evenBirthdays, oddBirthdays;
        double evenMoney, oddMoney;
        double washingPrice = Double.parseDouble(scan.nextLine());
        int toy = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int finalSum = 0;


        if (birthdays % 2 == 0) {
            evenBirthdays = birthdays / 2;
            oddBirthdays = evenBirthdays;
        } else {
            evenBirthdays = birthdays / 2;
            oddBirthdays = birthdays / 2 + birthdays % 2;
        }

        oddMoney = oddBirthdays * toy;

        for (int i = 0; i < evenBirthdays; i++) {
             sum = sum + 10;
             finalSum = finalSum + sum;
        }

        evenMoney = finalSum - evenBirthdays;
        double allMoney = evenMoney + oddMoney;

        if (allMoney >= washingPrice) {
            System.out.printf("Yes! %.2f", allMoney - washingPrice);
        } else {
            System.out.printf("No! %.2f", washingPrice - allMoney);
        }
    }
}
