package firstStepsExercise;

import java.util.Scanner;

public class fruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scan.nextLine());
        double bananaAmount = Double.parseDouble(scan.nextLine());
        double orangeAmount = Double.parseDouble(scan.nextLine());
        double raspberryAmount = Double.parseDouble(scan.nextLine());
        double strawberryAmount = Double.parseDouble(scan.nextLine());

        double raspberryPrice = strawberryPrice - (strawberryPrice * 0.5);
        double bananaPrice = raspberryPrice - (raspberryPrice * 0.8);
        double orangePrice = raspberryPrice - (raspberryPrice * 0.4);

        double money = strawberryPrice * strawberryAmount + bananaPrice * bananaAmount + raspberryAmount * raspberryPrice + orangeAmount * orangePrice;
        System.out.printf("%.2f", money);
    }
}
