/*Атанас решава да прекара отпуската си в Банско и да кара ски. Преди да отиде обаче, трябва да резервира
хотел и да изчисли колко ще му струва престоя. Съществуват следните видове помещения, със следните
цени за престой:
 &quot;room for one person&quot; – 18.00 лв. за нощувка
 &quot;apartment&quot; – 25.00 лв. за нощувка
 &quot;president apartment&quot; – 35.00 лв. за нощувка
Според броят на дните, в които ще остане в хотела (пример: 11 дни = 10 нощувки) и видът на помещението,
което ще избере, той може да ползва различно намаление.
След престоя, оценката на Атанас за услугите на хотела може да е позитивна (positive) или негативна
(negative) . Ако оценката му е позитивна, към цената с вече приспаднатото намаление Атанас добавя 25% от
нея. Ако оценката му е негативна приспада от цената 10%.*/

package advancedConditionals;

import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String rating = scan.nextLine();
        double discount1;
        double costANight;

        switch (room) {
            case "apartment":
                costANight = 25.00;
                if (days < 10) {
                    discount1 = 0.3;
                } else if (days <= 15) {
                    discount1 = 0.35;
                } else {
                    discount1 = 0.5;
                }
                break;
            case "president apartment":
                costANight = 35.00;
                if (days < 10) {
                    discount1 = 0.1;
                } else if (days <= 15) {
                    discount1 = 0.15;
                } else {
                    discount1 = 0.2;
                }
                break;
            case "room for one person":
                costANight = 18.00;
                discount1 = 0;
                break;
            default:
                costANight = 0;
                discount1 = 0;
                break;
        }

        double cost = costANight * (days - 1);
        double costDiscounted = cost - cost * discount1;

        switch (rating) {
            case "positive":
                double finalCost = costDiscounted + costDiscounted * 0.25;
                System.out.printf("%.2f", finalCost);
                break;
            case "negative":
                finalCost = costDiscounted - costDiscounted * 0.1;
                System.out.printf("%.2f", finalCost);
                break;
        }
    }
}
