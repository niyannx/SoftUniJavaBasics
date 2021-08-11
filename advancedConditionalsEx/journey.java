/*Странно, но повечето хора си плануват от рано почивката. Млад програмист разполага с определен бюджет и
свободно време в даден сезон. Напишете програма, която да приема на входа бюджета и сезона, а на
изхода да изкарва, къде ще почива програмиста и колко ще похарчи.
Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива
на къмпинг, а зимата в хотел. Ако е в Европа, независимо от сезона ще почива в хотел. Всеки къмпинг или
хотел, според дестинацията, има собствена цена която отговаря на даден процент от бюджета:
 При 100лв. или по-малко – някъде в България
o Лято – 30% от бюджета
o Зима – 70% от бюджета
 При 1000лв. или по малко – някъде на Балканите
o Лято – 40% от бюджета
o Зима – 80% от бюджета
 При повече от 1000лв. – някъде из Европа
o При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.

Вход
Входът се чете от конзолата и се състои от два реда, въведени от потребителя:
 Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
 Втори ред – Един от двата възможни сезона: „summer” или “winter”
Изход
На конзолата трябва да се отпечатат два реда.
 Първи ред – &quot;Somewhere in [дестинация]“ измежду &quot;Bulgaria&quot;, &quot;Balkans&quot; и &quot;Europe&quot;
 Втори ред – &quot;{Вид почивка} – {Похарчена сума}&quot;
o Почивката може да е между &quot;Camp&quot; и &quot;Hotel&quot;
o Сумата трябва да е закръглена с точност до вторият знак след запетаята.*/

package advancedConditionalsEx;

import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String location, occupation;
        double percent, finalCost;

        if (budget <= 100) {
            location = "Bulgaria";
            if (season.equals("summer")) {
                percent = 0.3;
                occupation = "Camp";
            } else {
                percent = 0.7;
                occupation = "Hotel";
            }
        } else if (budget > 100 && budget <= 1000) {
            location = "Balkans";
            if (season.equals("summer")) {
                percent = 0.4;
                occupation = "Camp";
            } else {
                percent = 0.8;
                occupation = "Hotel";
            }
        } else {
            location = "Europe";
            percent = 0.9;
            occupation = "Hotel";
        }

        finalCost = budget * percent;
        System.out.printf("Somewhere in %s\n", location);
        System.out.printf("%s - %.2f", occupation, finalCost);
    }
}
