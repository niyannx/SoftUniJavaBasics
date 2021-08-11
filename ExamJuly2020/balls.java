package ExamJuly2020;

import java.util.Scanner;

public class balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = Integer.parseInt(scan.nextLine());
        int counter = 0;
        double points = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int other = 0;
        int black = 0;

        while (counter < amount) {
            String colour = scan.nextLine();
            switch (colour) {
                case "red":
                    points = points + 5;
                    red++;
                    break;
                case "orange":
                    points = points + 10;
                    orange++;
                    break;
                case "yellow":
                    points = points + 15;
                    yellow++;
                    break;
                case "white":
                    points = points + 20;
                    white++;
                    break;
                case "black":
                    points = Math.floor(points / 2);
                    black++;
                    break;
                default:
                    other++;
                    break;
            }
            counter++;
        }
        System.out.printf("Total points: %.0f\n", points);
        System.out.println("Points from red balls: " + red);
        System.out.println("Points from orange balls: " + orange);
        System.out.println("Points from yellow balls: " + yellow);
        System.out.println("Points from white balls: " + white);
        System.out.println("Other colors picked: " + other);
        System.out.println("Divides from black balls: " + black);
    }
}
