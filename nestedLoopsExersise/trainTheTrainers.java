package nestedLoopsExersise;

import java.util.Scanner;

public class trainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amountMarks = Integer.parseInt(scan.nextLine());
        double average;
        double overallAverage = 0;
        int counter = 0;

        while (true) {
            String name = scan.nextLine();
            average = 0;
            if (name.equals("Finish")) {
                break;
            }

            for (int i = 0; i < amountMarks; i++) {
                double mark = Double.parseDouble(scan.nextLine());
                counter++;
                average = average + mark;
                overallAverage = overallAverage + mark;
            }
            average = average / amountMarks;
            System.out.printf("%s - %.2f.\n", name, average);
        }
        overallAverage = overallAverage / counter;
        System.out.printf("Student's final assessment is %.2f.", overallAverage);
    }
}
