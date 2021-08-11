package ExamMarch2020;

import java.util.Scanner;

public class suitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capacity = Double.parseDouble(scan.nextLine());

        int counter = 0;
        boolean enoughSpace = true;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            double luggage = Double.parseDouble(input);
            counter++;
            if (counter % 3 == 0) {
                luggage = luggage - luggage * 0.1;
            }
            capacity = capacity - luggage;

            if (capacity < 0) {
                counter--;
                System.out.printf("No more space!\nStatistic: %d suitcases loaded.", counter);
                enoughSpace = false;
                break;
            }
        }
        if (enoughSpace) {
            System.out.printf("Congratulations! All suitcases are loaded!\nStatistic: %d suitcases loaded.", counter);
        }
    }
}
