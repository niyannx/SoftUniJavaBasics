package firstSteps;

import java.util.*;

public class inchToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextDouble();
        double inchToCm = input * 2.54;

        System.out.println(inchToCm);
    }
}
