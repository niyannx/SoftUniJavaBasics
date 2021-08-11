package whileCycle;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (sum < n) {
            int currNum = Integer.parseInt(scan.nextLine());
            sum += currNum;
        }
        System.out.println(sum);

    }
}
