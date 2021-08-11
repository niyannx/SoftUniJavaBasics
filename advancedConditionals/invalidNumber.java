/*Дадено число е валидно, ако е в диапазона [100…200] или е 0. Да се напише програма, която чете цяло
число, въведено от потребителя, и печата &quot;invalid&quot; ако въведеното число не е валидно.*/

package advancedConditionals;
import java.util.Scanner;

public class invalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        if (input < 100 || input > 200) {
            if(input != 0) {
                System.out.println("invalid");
            }
        }
    }
}
