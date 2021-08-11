package ExamJuly2020;

import java.util.Scanner;

public class bestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = " ";

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scan.nextLine());
            if (goals >= 10) {
                System.out.printf("%s is the best player!\nHe has scored %d goals and made a hat-trick !!!", name, goals);
                return;
            }
            if (goals > maxGoals) {
                bestPlayer = name;
                maxGoals = goals;
            }
            name = scan.nextLine();
        }
        if (maxGoals >= 3) {
            System.out.printf("%s is the best player!\nHe has scored %d goals and made a hat-trick !!!", bestPlayer, maxGoals);
        } else {
            System.out.printf("%s is the best player!\nHe has scored %d goals.", bestPlayer, maxGoals);
        }
    }
}
