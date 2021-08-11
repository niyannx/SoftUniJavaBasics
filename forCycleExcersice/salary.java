package forCycleExcersice;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String site = scan.nextLine();
            if (site.equals("Instagram")) {
                salary -= 100;
            } else if (site.equals("Facebook")) {
                salary -= 150;
            } else if (site.equals("Reddit")) {
                salary -= 50;
            } else {
                salary -= 0;
            }
            if (salary == 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0){
            System.out.println(salary);
        }
    }
}
