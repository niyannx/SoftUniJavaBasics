/*Лято е с много променливо време и Виктор има нужда от вашата помощ. Напишете програма която спрямо
времето от денонощието и градусите да препоръча на Виктор какви дрехи да си облече. Вашия приятел има различни планове
за всеки етап от деня, които изискват и различен външен вид, тях може да видите от
таблицата.
От конзолата се четат точно два реда:
 Градусите - цяло число в интервала [10…42]
 Текст, време от денонощието - с възможности - &quot;Morning&quot;, &quot;Afternoon&quot;, &quot;Evening&quot;*/

package advancedConditionalsEx;

import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int temp = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        String outfit, shoes;

        if (temp >= 10 && temp <= 18) {
            if ("Morning".equals(time)) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (temp > 18 && temp <= 24) {
            if ("Afternoon".equals(time)) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else {
            switch (time) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                default:
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temp, outfit, shoes);
    }
}
