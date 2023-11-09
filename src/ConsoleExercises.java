import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        // Exercise 1
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Exploring the scanner Class
        // 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.printf("You entered %d%n", userNumber);

        // 2
        System.out.println("Enter your First word:");
        String word1 = scanner.next();

        System.out.println("Enter your Second word:");
        String word2 = scanner.next();

        System.out.println("Enter your Third word:");
        String word3 = scanner.next();
        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);

        System.out.println("Enter a sentence:");
        String userSentence = scanner.nextLine();
        System.out.printf("%s", userSentence);

        // Calculate the perimeter and area of Codeup's classrooms.
        System.out.println("Let's calculate the area and perimeter of your room");
        System.out.println("First what is the length of the room? :");
        int userLength = Integer.parseInt(scanner.nextLine());

        System.out.println("Now what is the width of your room? :");
        int userWidth = Integer.parseInt(scanner.nextLine());

        int area = userLength * userWidth;
        int perimeter = (userLength * 2) + (userWidth * 2);

        System.out.printf("The Area of your room is: %d.%nThe Perimeter of your room is: %d", area, perimeter);
    }
}
