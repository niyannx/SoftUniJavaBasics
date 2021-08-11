package ExamApril2019;

import java.util.Scanner;

public class oscarsCeremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());
        double statues = rent - rent * 0.3;
        double catering = statues - statues * 0.15;
        double sound = catering /2;

        System.out.printf("%.2f", rent + statues + catering + sound);
    }
}
