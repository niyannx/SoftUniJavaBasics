package ExamApril2019;

import java.util.Scanner;

public class oscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movie = scan.nextLine();
        String typeRoom = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        double price = 0;

        switch (movie) {
            case "A Star Is Born":
                if (typeRoom.equals("normal")) {
                    price = 7.50;
                } else if (typeRoom.equals("luxury")) {
                    price = 10.50;
                } else {
                    price = 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (typeRoom.equals("normal")) {
                    price = 7.35;
                } else if (typeRoom.equals("luxury")) {
                    price = 9.45;
                } else {
                    price = 12.75;
                }
                break;
            case "Green Book":
                if (typeRoom.equals("normal")) {
                    price = 8.15;
                } else if (typeRoom.equals("luxury")) {
                    price = 10.25;
                } else {
                    price = 13.25;
                }
                break;
            case "The Favourite":
                if (typeRoom.equals("normal")) {
                    price  = 8.75;
                } else if (typeRoom.equals("luxury")) {
                    price = 11.55;
                } else {
                    price = 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movie, tickets * price);

    }
}
