package forLoop;

import java.util.Scanner;

public class bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int months = Integer.parseInt(scan.nextLine());
        double overallElectric = 0;
        double overallWater = 0;
        double overallNet = 0;
        double overallOthers = 0;
        double average = 0;

        for (int i = 0; i < months; i++) {
            double electricTax = Double.parseDouble(scan.nextLine());
            overallElectric = overallElectric + electricTax;
            overallWater = overallWater + 20;
            overallNet = overallNet + 15;
            overallOthers = overallOthers + (20 + 15 + electricTax) + (20 + 15 + electricTax) * 0.2;
            average = average + electricTax + 20 + 15 + (20 + 15 + electricTax) + (20 + 15 + electricTax) * 0.2;
        }
        average = average / months;

        System.out.printf("Electricity: %.2f lv\n", overallElectric);
        System.out.printf("Water: %.2f lv\n", overallWater);
        System.out.printf("Internet: %.2f lv\n", overallNet);
        System.out.printf("Other: %.2f lv\n", overallOthers);
        System.out.printf("Average: %.2f lv", average);
    }
}
