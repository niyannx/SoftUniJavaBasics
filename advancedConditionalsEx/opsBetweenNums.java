/*Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена
математическа операция с тях. Възможните операции са: Събиране(+), Изваждане(-), Умножение(*),
Деление(/) и Модулно деление(%). При събиране, изваждане и умножение на конзолата трябва да се
отпечатат резултата и дали той е четен или нечетен. При обикновеното деление – резултата. При модулното
деление – остатъка. Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се
дели. В този случай трябва да се отпечата специално съобщениe.
Вход
От конзолата се прочитат 3 реда, въведени от потребителя:
 N1 – цяло число в интервала [0...40 000]
 N2 – цяло число в интервала [0...40 000]
 Оператор – един символ измеду: „+“, „-“, „*“, „/“, „%“*/

package advancedConditionalsEx;

import java.util.Scanner;

public class opsBetweenNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        double result;
        String evenOrOdd;

        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            default:
                result = 0;
                break;
        }

        if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                result = (double)n1 / (double)n2;
                System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
            }
        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                result = n1 % n2;
                System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
            }
        } else {
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
        }
    }
}