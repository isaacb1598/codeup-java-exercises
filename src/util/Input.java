package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }
    public boolean yesNo(){
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
    int getInt(int min, int max){
        int number;
        do {
            number = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
        } while (number < min || number > max);
        return number;
    }
    int getInt(){
        return scanner.nextInt();
    }
    double getDouble(double min, double max){
        double number;
        do {
            number = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over
        } while (number < min || number > max);
        return number;
    }
    double getDouble(){
        return scanner.nextDouble();
    }
}
