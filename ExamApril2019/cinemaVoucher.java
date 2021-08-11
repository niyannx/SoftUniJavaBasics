package ExamApril2019;

import java.util.Scanner;

public class cinemaVoucher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int voucher = Integer.parseInt(scan.nextLine());
        int currPrice;
        char one;
        char two;
        int counterMovie = 0;
        int counterOther = 0;


        while (true) {
            String input = scan.nextLine();

            if (input.equals("End")) {
                break;
            }

            if (input.length() > 8) {
                one = input.charAt(0);
                two = input.charAt(1);
                currPrice = one + two;
                voucher = voucher - currPrice;
                if (voucher < 0) {
                    break;
                } else {
                    counterMovie++;
                }
            } else {
                one = input.charAt(0);
                currPrice = one;
                voucher = voucher - currPrice;
                if (voucher < 0) {
                    break;
                } else {
                    counterOther++;
                }
            }

        }
        System.out.println(counterMovie);
        System.out.println(counterOther);
    }
}
