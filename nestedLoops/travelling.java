package nestedLoops;

import java.util.Scanner;

public class travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            String country = scan.nextLine();
            if(country.equals("End"))
            {
                break;
            }
            double budget = Double.parseDouble(scan.nextLine());
            double sum = 0;
            while(budget > sum){
                double money = Double.parseDouble(scan.nextLine());
                sum += money;
                money++;
            }
            System.out.printf("Going to %s!\n", country);
        }
    }
}
