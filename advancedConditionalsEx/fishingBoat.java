/*Тони и приятели много обичали да ходят за риба, те са толкова запалени по риболова, че решават да отидат
на риболов с кораб. Цената за наема на кораба зависи от сезона и броя рибари.
Цената зависи от сезона:
 Цената за наем на кораба през пролетта е 3000 лв.
 Цената за наем на кораба през лятото и есента е 4200 лв.
 Цената за наем на кораба през зимата е 2600 лв.
В зависимост от броя си групата ползва отстъпка:
 Ако групата е до 6 човека включително – отстъпка от 10%.
 Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
 Ако групата е от 12 нагоре – отстъпка от 25%.
Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат
допълнителна отстъпка.
Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.*/

package advancedConditionalsEx;
import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishers = Integer.parseInt(scan.nextLine());
        double price = 0;
        double discount;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishers <= 6) {
            discount = 0.10;
        } else if (fishers > 7 && fishers <= 11) {
            discount = 0.15;
        } else {
            discount = 0.25;
        }

        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            price = price - price * 0.05;
        }

        price = price - (price * discount);

        if (budget < price) {
            double shortage = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", shortage);
        } else {
            double profit = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", profit);
        }
    }
}
