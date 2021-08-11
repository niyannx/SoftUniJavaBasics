package ExamApril2019;

import java.util.Scanner;

public class movieRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String highestMovie = "";
        double highest = Double.MIN_VALUE;
        String lowestMovie = "";
        double lowest = Double.MAX_VALUE;
        double average = 0;

        for (int i = 1; i <= n; i++) {
            String movie = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());

            if (rating > highest) {
                highest = rating;
                highestMovie = movie;
            }
            if (rating < lowest) {
                lowest = rating;
                lowestMovie = movie;
            }
            average = average + rating;
        }
        System.out.printf("%s is with highest rating: %.1f\n", highestMovie, highest);
        System.out.printf("%s is with lowest rating: %.1f\n", lowestMovie, lowest);
        System.out.printf("Average rating: %.1f", average / n);
    }
}
