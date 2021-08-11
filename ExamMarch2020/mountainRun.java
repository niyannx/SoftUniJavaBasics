package ExamMarch2020;

import java.util.Scanner;

public class mountainRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double secondsPerMeter = Double.parseDouble(scan.nextLine());

        double hisTime = meters * secondsPerMeter;
        double slow = meters / 50;
        slow =  Math.floor(slow) * 30;
        hisTime = hisTime + slow;

        if (hisTime > record) {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(hisTime - record));
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", hisTime);
        }
    }
}
