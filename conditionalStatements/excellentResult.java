package conditionalStatements;

import java.util.Scanner;

public class excellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mark = scan.nextInt();
        if (mark >= 5){
            System.out.println("Excellent!");
        }
    }
}
