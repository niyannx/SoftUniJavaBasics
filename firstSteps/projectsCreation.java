package firstSteps;

import java.util.Scanner;

public class projectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hoursNeeded, projects);
    }
}
 