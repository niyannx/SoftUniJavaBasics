package whileLoop;

import java.util.Scanner;

public class streamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean oHasOccurred = false;
        boolean cHasOccurred = false;
        boolean nHasOccurred = false;
        String word = " ";

        String input = scan.nextLine();

        while (!input.equals("End")) {
            char letter = input.charAt(0);
            boolean attachLetter = false;
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                switch (letter) {
                    case 'o':
                        attachLetter = oHasOccurred;
                        oHasOccurred = true;
                        break;
                    case 'n':
                        attachLetter = nHasOccurred;
                        nHasOccurred = true;
                        break;
                    case 'c':
                        attachLetter = cHasOccurred;
                        cHasOccurred = true;
                        break;
                    default:
                        attachLetter = true;
                }
            }

            if (attachLetter) {
                word += letter;
            }
            if (oHasOccurred && nHasOccurred && cHasOccurred) {
                System.out.print(word + ' ');
                word = "";
                oHasOccurred = false;
                cHasOccurred = false;
                nHasOccurred = false;
            }
            input = scan.nextLine();
        }
    }
}
