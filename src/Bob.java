import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String userChoice;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Say something to Bob:");
            String convo = scanner.nextLine();
            System.out.println("Bob says:");
            if (convo.trim().isEmpty()){
                System.out.println("Fine Be that way!");
            } else if (convo.trim().endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (convo.trim().endsWith("?")){
                System.out.println("Sure.");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Do you want to continue your conversation? (Y/N)");
            userChoice = scanner.nextLine().toLowerCase();
        }while (userChoice.equals("yes") || userChoice.equals("y"));
    }
}
