package whileCycle;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int excluded = 0;
        double sum = 0;
        int counter = 0;

        while (counter < 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade < 4) {
                excluded++;
            }
            if (excluded >= 2) {
                System.out.printf("%s has been excluded at %d grade", name, counter);
                break;
            }
            sum += grade;
            counter++;
        }
        if (counter == 12){
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
