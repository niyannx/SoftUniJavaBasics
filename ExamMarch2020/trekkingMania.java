package ExamMarch2020;

import java.util.Scanner;

public class trekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groups = Integer.parseInt(scan.nextLine());
        int allPeople = 0;
        double Musala = 0;
        double Monblan = 0;
        double Kilimandjaro = 0;
        double K2 = 0;
        double Everest = 0;

        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scan.nextLine());
            allPeople = allPeople + people;

            if (people <= 5) {
                Musala = Musala + people;
            } else if (people <= 12) {
                Monblan = Monblan + people;
            } else if (people <= 25) {
                Kilimandjaro = Kilimandjaro + people;
            } else if (people <= 40) {
                K2 = K2 + people;
            } else {
                Everest = Everest + people;
            }
        }

        Musala = Musala / allPeople * 100;
        Monblan = Monblan / allPeople * 100;
        Kilimandjaro = Kilimandjaro / allPeople * 100;
        K2 = K2 / allPeople * 100;
        Everest = Everest / allPeople * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", Musala, Monblan, Kilimandjaro, K2, Everest);
    }
}
