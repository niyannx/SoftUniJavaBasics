package conditionalsExercise;

import java.util.Scanner;

public class metricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double toConvert = Double.parseDouble(scan.nextLine());
        String firstUnit = scan.nextLine();
        String secondUnit = scan.nextLine();

        if (firstUnit.equals("mm")) {
            if(secondUnit.equals("cm")){
                toConvert = toConvert * 0.1;
                System.out.printf("%.3f", toConvert);
            } if (secondUnit.equals("m")) {
                toConvert = toConvert * 0.001;
                System.out.printf("%.3f", toConvert);
            }
        }
        if (firstUnit.equals("cm")) {
            if(secondUnit.equals("m")){
                toConvert = toConvert * 0.01;
                System.out.printf("%.3f", toConvert);
            } if (secondUnit.equals("mm")) {
                toConvert = toConvert * 10;
                System.out.printf("%.3f", toConvert);
            }
        }
        if (firstUnit.equals("m")) {
            if(secondUnit.equals("cm")){
                toConvert = toConvert * 100;
                System.out.printf("%.3f", toConvert);
            } if (secondUnit.equals("mm")) {
                toConvert = toConvert * 1000;
                System.out.printf("%.3f", toConvert);
            }
        }
    }
}
