package nestedLoops;

import java.util.Scanner;

public class cinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double seatsTaken;
        int totalTickets = 0;
        double student = 0;
        double standard = 0;
        double kid = 0;

        while (true) {
            seatsTaken = 0;
            String movie = scan.nextLine();
            if (movie.equals("Finish")) {
                break;
            }
            int freeSeats = Integer.parseInt(scan.nextLine());
            while (true) {
                String typeTicket = scan.nextLine();
                if (typeTicket.equals("End")) {
                    double full = seatsTaken / freeSeats * 100;
                    System.out.printf("%s - %.2f%% full.\n", movie, full);
                    break;
                } else {
                    seatsTaken++;
                    totalTickets++;
                    if (typeTicket.equals("student")) {
                        student++;
                    } else if (typeTicket.equals("standard")) {
                        standard++;
                    } else {
                        kid++;
                    }
                }
                if (seatsTaken == freeSeats) {
                    double full = seatsTaken / freeSeats * 100;
                    System.out.printf("%s - %.2f%% full.\n", movie, full);
                    break;
                }
            }
        }
        student = (student / totalTickets) * 100;
        standard = (standard / totalTickets) * 100;
        kid = (kid / totalTickets) * 100;

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", student);
        System.out.printf("%.2f%% standard tickets.\n", standard);
        System.out.printf("%.2f%% kids tickets.\n", kid);
    }
}
