package forLoop;

import java.util.Scanner;

public class footballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capacity = Double.parseDouble(scan.nextLine());
        int fans = Integer.parseInt(scan.nextLine());

        double A = 0;
        double B = 0;
        double V = 0;
        double G = 0;

        for (int i = 0; i < fans; i++) {
            String sector = scan.nextLine();
            switch (sector) {
                case "A":
                    A++;
                    break;
                case "B":
                    B++;
                    break;
                case "V":
                    V++;
                    break;
                default:
                    G++;
            }
        }

        capacity = fans / capacity * 100;
        A = A / fans * 100;
        B = B / fans * 100;
        V = V / fans * 100;
        G = G / fans * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", A, B, V, G, capacity);
    }
}
