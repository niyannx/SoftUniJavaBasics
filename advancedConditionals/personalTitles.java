/*Да се напише конзолна програма, която прочита възраст (десетично число) и пол (&quot;m&quot; или &quot;f&quot;), въведени от
потребителя, и отпечатва обръщение измежду следните:
 &quot;Mr.&quot; - мъж (пол &quot;m&quot;) на 16 или повече години
 &quot;Master&quot; - момче (пол &quot;m&quot;) под 16 години
 &quot;Ms.&quot; - жена (пол &quot;f&quot;) на 16 или повече години
 &quot;Miss&quot; - момиче (пол &quot;f&quot;) под 16 години*/

package advancedConditionals;

import java.util.Scanner;

public class personalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        if (age < 16) {
            if (gender.equals("f")) {
                System.out.println("Miss");
            } else {
                System.out.println("Master");
            }
        } else {
            if (gender.equals("f")) {
                System.out.println("Ms.");
            } else {
                System.out.println("Mr.");
            }
        }
    }
}
