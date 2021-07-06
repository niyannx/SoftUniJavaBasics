package conditionalsExercise;

import java.util.Scanner;

public class time15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes = minutes + 15;
        if (minutes > 59){
            hours = hours + 1;
            minutes = minutes - 60;
        }
        if (hours > 23){
            hours = hours - 24;
        }

        // за водеща нула :
        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
        System.out.printf("%d:%d", hours, minutes);
        }
    }
}
