package ExamMarch2020;

import java.util.Scanner;

public class tournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());

        int currentDay = 0;
        double moneyDaily = 0;
        double moneyEarned = 0;
        int overallCounterWin = 0;
        int overallCounterLost = 0;
        int currentCounterWin = 0;
        int currentCounterLost = 0;

        while (currentDay < days) {
            String sport = scan.nextLine();

            if (sport.equals("Finish")) {
                if (currentCounterWin > currentCounterLost) {
                    moneyEarned = moneyEarned + (moneyDaily + moneyDaily * 0.1);
                } else {
                    moneyEarned = moneyEarned + moneyDaily;
                }
                moneyDaily = 0;
                currentCounterLost = 0;
                currentCounterWin = 0;
                currentDay++;
                continue;
            }

            String winLose = scan.nextLine();

            if (winLose.equals("win")) {
                currentCounterWin++;
                overallCounterWin++;
                moneyDaily = moneyDaily + 20;
            } else {
                currentCounterLost++;
                overallCounterLost++;
            }
        }

        if (overallCounterLost > overallCounterWin) {
            System.out.printf("You lost the tournament! Total raised money: %.2f", moneyEarned);
        } else {
            System.out.printf("You won the tournament! Total raised money: %.2f", moneyEarned + moneyEarned * 0.2);
        }
    }
}
