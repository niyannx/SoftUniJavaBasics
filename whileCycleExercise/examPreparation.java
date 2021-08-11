package whileCycleExercise;

import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int badMarks = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int counterForBadMarks = 0;
        double avgScore = 0;
        int counterForProblems = 0;
        String lastProblem = " ";

        while (!input.equals("Enough")) {
            counterForProblems++;
            int mark = Integer.parseInt(scan.nextLine());
            if (mark <= 4) {
              counterForBadMarks++;
            }
            if (counterForBadMarks == badMarks) {
                System.out.printf("You need a break, %d poor grades.", counterForBadMarks);
                break;
            }
            avgScore = avgScore + mark;
            lastProblem = input;
            input = scan.nextLine();
        }
        if (input.equals("Enough")) {
            avgScore = avgScore / counterForProblems;
            System.out.printf("Average score: %.2f \nNumber of problems: %d \nLast problem: %s", avgScore, counterForProblems, lastProblem);
        }
    }
}
