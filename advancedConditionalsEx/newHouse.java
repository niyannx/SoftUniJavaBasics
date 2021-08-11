/*Марин и Нели си купуват къща не далеч от София. Нели толкова много обича цветята, че Ви убеждава да
напишете програма която да изчисли колко ще им струва, да си засадят определен брой цветя и дали
наличния бюджет ще им е достатъчен. Различните цветя са с различни цени.
Съществуват следните отстъпки:
 Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
 Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
 Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
 Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
 Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
От конзолата се четат 3 реда:
 Вид цветя - текст с възможности - &quot;Roses&quot;, &quot;Dahlias&quot;, &quot;Tulips&quot;, &quot;Narcissus&quot;, &quot;Gladiolus&quot;
 Брой цветя - цяло число в интервала [10…1000]
 Бюджет - цяло число в интервала [50…2500]
*/

package advancedConditionalsEx;

import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rosePrice = 5.00;
        double dahliaPrice = 3.80;
        double tulipPrice = 2.80;
        double narcissusPrice = 3.00;
        double gladiolusPrice = 2.50;
        double discount = 0;
        double finalPrice;

        String typeFlowers = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        if (typeFlowers.equals("Roses") || typeFlowers.equals("Dahlias") || typeFlowers.equals("Tulips")){
            switch (typeFlowers) {
                case "Roses":
                    finalPrice = quantity * rosePrice;
                    if (quantity > 80) {
                        discount = 0.10;
                    }
                    break;
                case "Dahlias":
                    finalPrice = quantity * dahliaPrice;
                    if (quantity > 90) {
                        discount = 0.15;
                    }
                    break;
                default:
                    finalPrice = quantity * tulipPrice;
                    if (quantity > 80) {
                        discount = 0.15;
                    }
                    break;
            }
            finalPrice = finalPrice - finalPrice * discount;
        } else {
            if (typeFlowers.equals("Narcissus")) {
                finalPrice = quantity * narcissusPrice;
                if (quantity < 120) {
                    discount = 0.15;
                }
            } else {
                finalPrice = quantity * gladiolusPrice;
                if (quantity < 80) {
                    discount = 0.20;
                }
            }
            finalPrice = finalPrice + finalPrice * discount;
        }

        if (finalPrice > budget) {
            double needed = finalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needed);
        } else {
            double profit = budget - finalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, typeFlowers, profit);
        }
    }
}