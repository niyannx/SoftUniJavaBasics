package whileCycleExercise;

import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        String searchedBook = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals(searchedBook)) {
            if (input.equals("No More Books")) {
                System.out.printf("The book you search is not here! \nYou checked %d books.", counter);
                break;
            }
            counter = counter + 1;
            input = scan.nextLine();
        }
        if (input.equals(searchedBook)) {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}
