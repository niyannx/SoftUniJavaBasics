package whileCycleExercise;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int cakePieces = length * width;

        while (!input.equals("STOP")) {
            int piece = Integer.parseInt(input);
            cakePieces -= piece;
            if (cakePieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}
