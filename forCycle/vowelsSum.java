package forCycle;

import java.util.Scanner;

public class vowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum = 0;
        int letterValue;

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter == 'a') {
                letterValue = 1;
            } else if (letter == 'e') {
                letterValue = 2;
            } else if (letter == 'i') {
                letterValue = 3;
            } else if (letter == 'o') {
                letterValue = 4;
            } else if (letter == 'u') {
                letterValue = 5;
            } else {
                letterValue = 0;
            }
            sum = sum + letterValue;
        }
        System.out.println(sum);
    }
}