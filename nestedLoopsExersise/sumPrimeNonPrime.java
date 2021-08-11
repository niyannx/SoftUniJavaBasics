package nestedLoopsExersise;

import java.util.Scanner;

public class sumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isPrime = false;
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
            }

            int i, flag = 0;
            if (number == 0 || number == 1) {
                isPrime = false;
            } else {
                for (i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0 && number > 0) {
                    isPrime = true;
                }
                if (isPrime) {
                    sumPrime = sumPrime + number;
                } else if (number > 0) {
                    sumNonPrime = sumNonPrime + number;
                }
            }
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}
