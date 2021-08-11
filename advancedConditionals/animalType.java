/*Напишете програма, която отпечатва класа на животното според неговото име, въведено от потребителя.
 dog ->; mammal
 crocodile, tortoise, snake ->; reptile
 others ->; unknown*/

package advancedConditionals;

import java.util.Scanner;

public class animalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
