/*Студент трябва да отиде на изпит в определен час. Той идва в изпитната зала в даден час на пристигане.
Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на изпита или до половин час преди това.
Ако е пристигнал по-рано повече от 30 минути, той е подранил. Ако е дошъл след часа на изпита, той е
закъснял. Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали
студентът е дошъл навреме, дали е подранил или е закъснял и с колко часа или минути е подранил или
закъснял.
Вход
От конзолата се четат 4 цели числа (по едно на ред), въведени от потребителя:
 Първият ред съдържа час на изпита – цяло число от 0 до 23.
 Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
 Третият ред съдържа час на пристигане – цяло число от 0 до 23.
 Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.*/

package advancedConditionalsEx;
import java.util.Scanner;

public class onTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scan.nextLine());
        int minutesOfExam = Integer.parseInt(scan.nextLine());
        int hourOfArrival = Integer.parseInt(scan.nextLine());
        int minutesOfArrival = Integer.parseInt(scan.nextLine());

        int totalMinutesArrival = hourOfArrival * 60 + minutesOfArrival;
        int totalMinutesExam = hourOfExam * 60 + minutesOfExam;
        int hoursLeft = 0;
        int minsLeft = 0;
        int difference;

        if (totalMinutesArrival > totalMinutesExam) {
            System.out.println("Late");
            difference = totalMinutesArrival - totalMinutesExam;
            if (difference >= 60) {
                hoursLeft = difference / 60;
                minsLeft = difference % 60;
                if (minsLeft < 10) {
                    System.out.printf("%d:0%d hours after the start", hoursLeft, minsLeft);
                } else {
                    System.out.printf("%d:%d hours after the start", hoursLeft, minsLeft);
                }
            } else {
                minsLeft = difference;
                System.out.printf("%d minutes after the start", minsLeft);
            }

        } else if (totalMinutesArrival < totalMinutesExam - 30) {
            System.out.println("Early");
            difference = totalMinutesExam - totalMinutesArrival;
            if (difference >= 60) {
                hoursLeft = difference / 60;
                minsLeft = difference % 60;
                if (minsLeft < 10) {
                    System.out.printf("%d:0%d hours before the start", hoursLeft, minsLeft);
                } else {
                    System.out.printf("%d:%d hours before the start", hoursLeft, minsLeft);
                }
            } else {
                minsLeft = difference;
                System.out.printf("%d minutes before the start", minsLeft);
            }

        } else {
            System.out.println("On time");
            difference = totalMinutesExam - totalMinutesArrival;
            if (difference != 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        }
    }
}
