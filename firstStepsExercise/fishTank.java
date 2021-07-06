package firstStepsExercise;

import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double velocity = length * width * height;
        double allLiters = velocity * 0.001;
        double objects = allLiters * (percent * 0.01);
        double liters = allLiters - objects;

        System.out.printf("%.2f", liters);
    }
}
