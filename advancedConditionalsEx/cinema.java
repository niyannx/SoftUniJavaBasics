/*В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони. Има три вида прожекции с
билети на различни цени:
 Premiere – премиерна прожекция, на цена 12.00 лева.
 Normal – стандартна прожекция, на цена 7.50 лева.
 Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
Напишете програма, която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа),
въведени от потребителя, и изчислява общите приходи от билети при пълна зала.*/

package advancedConditionalsEx;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        double income = 0.0;
        if ("Premiere".equals(projection)) {
            income = rows * cols * 12;
        } else if ("Normal".equals(projection)) {
            income = rows * cols * 7.5;
        } else if ("Discount".equals(projection)) {
            income = rows * cols * 5;
        }
        System.out.printf("%.2f leva", income);
    }
}
