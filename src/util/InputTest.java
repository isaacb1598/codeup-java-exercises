package util;

public class InputTest {

    public static void main(String[] args) {
        util.Input input = new util.Input();

        System.out.println("Enter a string:");
        String string = input.getString();
        System.out.println("You entered: " + string);

        System.out.println("Enter yes or no:");
        boolean yesNo = input.yesNo();
        System.out.println("You entered: " + yesNo);

        System.out.println("Enter an integer between 1 and 10:");
        int intNumber = input.getInt(1, 10);
        System.out.println("You entered: " + intNumber);

        System.out.println("Enter an integer:");
        int intNumber2 = input.getInt();
        System.out.println("You entered: " + intNumber2);

        System.out.println("Enter a double between 1.0 and 10.0:");
        double doubleNumber = input.getDouble(1.0, 10.0);
        System.out.println("You entered: " + doubleNumber);

        System.out.println("Enter a double:");
        double doubleNumber2 = input.getDouble();
        System.out.println("You entered: " + doubleNumber2);
    }

}
