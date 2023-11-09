import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        // loop Basics
        // while
        /*int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }
         //do while
        int counter = 0;
        do {
            System.out.println(counter);
            counter = counter + 2;
        } while (counter <= 100);

        int backCounter = 100;
        do {
            System.out.println(backCounter);
            backCounter = backCounter - 5;
        } while (backCounter >= -10);

        int squareCounter = 2;
        do {
            System.out.println(squareCounter);
            squareCounter = (int) Math.pow(squareCounter,2);
        } while (squareCounter <= 1000000);
         */

        // for
        /*for (int i = 5; i <= 15; i++){
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i+= 2){
            System.out.println(i);
        }

        for (int i =100; i>= -10; i -= 5) {
            System.out.println(i);
        }

        for (int i =2; i <= 1000000; i = (int) Math.pow(i,2)){
            System.out.println(i);
        }

        // fizzbuzz
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
         */
        // display a table of powers
        Scanner scanner = new Scanner(System.in);

        System.out.println("I am going to create a table of powers for you.");
        System.out.println("What number would you like to go up to?");
        int tableNum = Integer.parseInt(scanner.nextLine());

        int col1 = 1;
        int col2 = 2;
        int col3 = 3;
//        int row2 = (int)Math.pow(tableNum, 2);
        for (int i = 1; i <= tableNum; i++){
            System.out.println(i);
        }


        System.out.printf("number | squared | cubed%n------ | ------- | -----%n%-7d|%-9d|%-6d",col1, col2, col3);
    }
}
/*
number | squared | cubed
------ | ------- | -----
1      | 1       | 1
2      | 4       | 8
3      | 9       | 27
4      | 16      | 64
5      | 25      | 125

 */