import java.util.Scanner;

public class ConsoleIoLecture {

    public static void main(String[] args) {
        String cohort = "Hippogriff";
        byte week = 9;
        double completionPercentage = 38.7525;
        System.out.printf("Hello, %s, welcome to week %d! You are %.4f%% of the way through.%n", cohort, week, completionPercentage);

        // create a scanner object
        // set it to scan the command line for input
        Scanner scanner = new Scanner(System.in);
        // output to command line
        /*System.out.println("Say something:");
        // use my scanner object to get user input
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        Scanner hello = new Scanner(System.in);
        System.out.println("Tell me your name:");
        String userName = hello.next();
        System.out.printf("Hello, %s%n", userName);*/

        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.printf("You entered %d%n", userNumber);
        System.out.println("Do you want to enter another number?");

    }
}
