package forLoop;

import java.util.Scanner;

public class hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int period = Integer.parseInt(scan.nextLine());
        int doctors = 7;
        int treated = 0;
        int untreated = 0;

        for (int day = 1; day <= period; day++) {
            int patients = Integer.parseInt(scan.nextLine());

            if (day % 3 == 0) {
                if (untreated > treated) {
                    doctors++;
                }
            }

            if (patients > doctors) {
                untreated = untreated + (patients - doctors);
                treated = treated + doctors;
            } else {
                treated = treated + patients;
            }
        }

        System.out.printf("Treated patients: %d.\n", treated);
        System.out.printf("Untreated patients: %d.", untreated);

    }
}
