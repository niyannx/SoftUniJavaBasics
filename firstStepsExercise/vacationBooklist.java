package firstStepsExercise;

import java.util.Scanner;

public class vacationBooklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int hoursADay = (totalPages / pagesPerHour) / days;
        System.out.println(hoursADay);
    }
}
