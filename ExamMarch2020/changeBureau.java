package ExamMarch2020;

import java.util.Scanner;

public class changeBureau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scan.nextLine());
        double yuan = Double.parseDouble(scan.nextLine());
        double commission = Double.parseDouble(scan.nextLine());

        double lev = (bitcoin * 1168) + (yuan * 0.15) * 1.76;
        double euro = lev / 1.95;
        euro = euro - euro * commission / 100;

        System.out.printf("%.2f", euro);
    }
}
