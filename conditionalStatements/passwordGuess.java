package conditionalStatements;

import java.util.Scanner;

public class passwordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String guess = scan.nextLine();
        String pass = "s3cr3t!P@ssw0rd";

        if (guess.equals(pass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
