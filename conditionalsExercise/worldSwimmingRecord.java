package conditionalsExercise;

import java.util.Scanner;

public class worldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double secondsAMeter = Double.parseDouble(scan.nextLine());

        double hisTime1 = meters * secondsAMeter;
        double hisTime2 = (meters / 15) * 12.5;
        double hisTime = hisTime1 + hisTime2;

        if (recordSeconds < hisTime){
            double beatTheRecord = hisTime - recordSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", beatTheRecord);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", hisTime);
        }
    }
}
