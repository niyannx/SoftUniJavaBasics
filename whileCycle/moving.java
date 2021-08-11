package whileCycle;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int widthFreeSpace = Integer.parseInt(scan.nextLine());
        int lengthFreeSpace = Integer.parseInt(scan.nextLine());
        int heightFreeSpace = Integer.parseInt(scan.nextLine());

        int cubicMetersFree = widthFreeSpace * lengthFreeSpace * heightFreeSpace;
        int cubicMetersBoxes = 0;
        int left;

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            cubicMetersBoxes = cubicMetersBoxes + boxes;

            if (cubicMetersFree < cubicMetersBoxes) {
                left = Math.abs(cubicMetersBoxes - cubicMetersFree);
                System.out.printf("No more free space! You need %d Cubic meters more.", left);
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Done")) {
            if (cubicMetersBoxes < cubicMetersFree) {
                left = Math.abs(cubicMetersBoxes - cubicMetersFree);
                System.out.printf("%d Cubic meters left.", left);
            }
        }
    }
}
