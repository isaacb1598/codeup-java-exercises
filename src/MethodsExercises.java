import java.util.Scanner;

public class MethodsExercises {

    private static Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) {
//         System.out.println("Time for some addition");
//         System.out.println("Enter the first number:");
//         int addX = scanner.nextInt();
//         System.out.println("Enter the second number:");
//         int addY = scanner.nextInt();
//         int add = addition(addX,addY);
//         System.out.printf("The result is %d%n",add);
//
//         System.out.println("Time for some subtraction");
//         System.out.println("Enter the first number:");
//         int subX = scanner.nextInt();
//         System.out.println("Enter the second number:");
//         int subY = scanner.nextInt();
//         int sub = subtraction(subX,subY);
//         System.out.printf("The result is %d%n",sub);
//
//         System.out.println("Time for some multiplication");
//         System.out.println("Enter the first number:");
//         int multiplyX = scanner.nextInt();
//         System.out.println("Enter the second number:");
//         int multiplyY = scanner.nextInt();
//         int multiply = multiplication(multiplyX,multiplyY);
//         System.out.printf("The result is %d%n",multiply);
//
//         System.out.println("Time for some division");
//         System.out.println("Enter the first number:");
//         int divideX = scanner.nextInt();
//         System.out.println("Enter the second number:");
//         int divideY = scanner.nextInt();
//         int divide = division(divideX,divideY);
//         System.out.printf("The result is %d%n",divide);
//
//         System.out.println("Time for modulus");
//         System.out.println("Enter the first number:");
//         int modX = scanner.nextInt();
//         System.out.println("Enter the second number:");
//         int modY = scanner.nextInt();
//         int mod = modulus(modX,modY);
//         System.out.printf("The result is %d%n",mod);
//
//         System.out.print("Enter a number between 1 and 10:");
//         int userInput = getInteger(1, 10);
//         System.out.println("You entered: " + userInput);
//
//         System.out.println("Enter a number between 1 and 10");
//         int userval = scanner.nextInt();
//         int myFactVal = 1;
//         for (int i = 1; i <= userval; i++) {
//             myFactVal *= i;
//         }
//         System.out.println(myFactVal);
//
//         String choice = "y";
//
//         while (choice.equalsIgnoreCase("y")) {
//             choice = calculateFactorialAndGetUserInput(scanner);
//         }
//     }
//
//     //======== Basic Arithmetic========
//     public static int addition(int x, int y){
//         return x + y;
//     }
//
//     public static int subtraction(int x, int y){
//         return x - y;
//     }
//
//     public static int multiplication(int x, int y){
//         return x * y;
//     }
//
//     public static int division(int x, int y){
//         return x / y;
//     }
//
//     public static int modulus(int x, int y){
//         return x % y;
//     }
//
//     // ========= Range method ===========
//     public static int getInteger(int min, int max){
//         Scanner scanner = new Scanner(System.in);
//         int input;
//
//         while (true) {
//             System.out.printf("Enter a number between %d and %d: %n",min , max);
//             while (!scanner.hasNextInt()) {
//                 System.out.println("That's not a number enter a number: ");
//                 scanner.next();
//             }
//             input = scanner.nextInt();
//             if (input >= min && input <= max) {
//                 break;
//             } else {
//                 System.out.println("Number is out of range! Please enter a number between " + min + " and " + max + ": ");
//             }
//         }
//         return input;
//     }
//
// // ======== factorial =========== //
//
//     public static String calculateFactorialAndGetUserInput(Scanner scanner) {
//         System.out.println("Enter a number between 1 and 10");
//         int userVal = scanner.nextInt();
//         while (userVal < 1 || userVal > 10) {
//             System.out.println("Invalid number. Please enter a number between 1 and 10");
//             userVal = scanner.nextInt();
//         }
//         long factorial = 1;
//         for (int i = 1; i <= userVal; i++) {
//             factorial *= i;
//         }
//         System.out.println("The factorial of " + userVal + " is " + factorial);
//
//         System.out.println("Do you want to continue? (y/n)");
//         return scanner.next();
//     }
//
    //============= Dice Roll ==============

    public static void rollDice(int numSides) {
        int die1 = randomInt(1, numSides);
        System.out.println("You rolled a " + die1);

        int die2 = randomInt(1, numSides);
        System.out.println("You rolled a " + die2);

    }
    public static int randomInt(int low, int high) {
        return (int) Math.floor(Math.random() * (high - low + 1) + low);
    }

    public static void main(String[] args) {

        System.out.print("Enter the number of sides for pair of dice: ");
        int sideNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Press Enter to roll some dice!");
        scanner.nextLine();

        rollDice(sideNum);

        System.out.print("Roll again (y/n)? ");
        String choice = scanner.nextLine().trim();
        if(choice.equalsIgnoreCase("Y")) {
            rollDice(sideNum);
        }
    }
}