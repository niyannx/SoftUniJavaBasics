/*Хотел предлага 2 вида стаи: студио и апартамент. Напишете програма, която изчислява цената за целия
престой за студио и апартамент. Цените зависят от месеца на престоя.
Предлагат се и следните отстъпки:
 За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
 За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
 За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
 За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
Вход
Входът се чете от конзолата и съдържа точно 2 реда, въведени от потребителя:
 На първия ред е месецът – May, June, July, August, September или October
 На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
*/

package advancedConditionalsEx;

import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int stay = Integer.parseInt(scan.nextLine());
        double costStudio, costApartment;

        switch (month) {
            case "May":
            case "October":
                costStudio = 50 * stay;
                costApartment = 65 * stay;
                if (stay > 7 && stay <= 14){
                     costStudio = costStudio - (costStudio / 100 * 5);
                } else if (stay > 14) {
                    costStudio = costStudio - (costStudio / 100 * 30);
                }
                break;
            case "June":
            case "September":
                costStudio = 75.2 * stay;
                costApartment = 68.7 * stay;
                if (stay > 14) {
                    costStudio = costStudio - (costStudio / 100 * 20);
                }
                break;
            default:
                costStudio = 76 * stay;
                costApartment = 77 * stay;
                break;
        }

        if (stay > 14) {
            costApartment = costApartment - (costApartment / 100 * 10);
        }

        System.out.printf("Apartment: %.2f lv.\n", costApartment);
        System.out.printf("Studio: %.2f lv.", costStudio);
    }
}
