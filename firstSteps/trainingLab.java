package firstSteps;

import java.util.Scanner;

public class trainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        h = h * 100;
        h = h - 100;
        h = Math.floor(h / 70);

        w = w * 100;
        w = Math.floor(w / 120);

        int workspaces = (int) (h * w - 3);
        System.out.println(workspaces);
    }
}
