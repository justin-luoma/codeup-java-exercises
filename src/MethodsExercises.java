import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.printf("1 + 1 = 2: %d%n", add(1, 1));
        System.out.printf("1 - 1 = 0: %d%n", subtract(1, 1));
        System.out.printf("2 * 2 = 4: %d%n", multiple(2, 2));
        System.out.printf("4 ÷ 2 = 2: %d%n", divide(4, 2));
        System.out.printf("5 %% 2 = 1: %d%n", modulus(5, 2));
        System.out.printf("5 * 3 = 15: %d%n", multipleRecusion(5, 3));

        System.out.print("Enter a number between 1 and 16: ");
        int userInput = getInteger(1, 16);
//        System.out.printf("%nYou entered: %s%n", userInput);

        System.out.printf("%n%s! = %s%n", userInput, factorial(userInput));
//        for(int i = 15; i < Integer.MAX_VALUE; i++) {
//            System.out.printf("i = %s, %s! = %s%n", i, i , factorial(i));
//        }
        rollDiceApp();
    }
    /*Basic Arithmetic

        Create four separate methods. Each will perform an arithmetic operation:

        Addition
        Subtraction
        Multiplication
        Division
        Each function needs to take two parameters/arguments so that the operation can be performed.

        Test your functions and verify the output.

        Add a modulus function that finds the modulus of two numbers.

        Food for thought: What happens if we try to divide by zero? What should happen?

        Bonus

        Create your multiplication method without the * operator (Hint: a loop might be helpful).
        Do the above with recursion.*/
    public static int add(int augend, int addend) {
        return augend + addend;
    }

    public static int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public static int multiple(int multiplier, int multiplicand) {
        return multiplier * multiplicand;
    }

    public static int multipleRecusion(int multiplier, int multiplicand) {
        if (multiplicand <= 0) {
            return 0;
        }
        return multiplier + multipleRecusion(multiplier, multiplicand -1);
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static int modulus(int dividend, int divisor) {
        return dividend % divisor;
    }

    /*Create a method that validates that user input is in a certain range

        The method signature should look like this:


        public static int getInteger(int min, int max);
        and is used like this:


        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        If the input is invalid, prompt the user again.

        Hint: recursion might be helpful here!*/
    public static int getInteger(int min, int max) {
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
//        s.nextLine();
        if (userInput < min || userInput > max) {
            System.out.printf("%nInvalid input, try again: ");
            return getInteger(min, max);
        }
        return userInput;
    }

    /*Calculate the factorial of a number.

        Prompt the user to enter an integer from 1 to 10.
        Display the factorial of the number entered by the user.
        Ask if the user wants to continue.
        Use a for loop to calculate the factorial.
        Assume that the user will enter an integer, but verify it’s between 1 and 10.
        Use the long type to store the factorial.
        Continue only if the user agrees to.
        A factorial is a number multiplied by each of the numbers before it.
        Factorials are denoted by the exclamation point (n!). Ex:


        1! = 1               = 1
        2! = 1 x 2           = 2
        3! = 1 x 2 x 3       = 6
        4! = 1 x 2 x 3 x 4   = 24
        Bonus

        Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
        Use Recursion to implement the factorial.*/
    public static int factorial(int num) {
        if (num <=0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    /*Create an application that simulates dice rolling.

        Ask the user to enter the number of sides for a pair of dice.
        Prompt the user to roll the dice.
        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        Use static methods to implement the method(s) that generate the random numbers.
        Use the .random method of the java.lang.Math class to generate random numbers.*/
    public static void rollDiceApp() {
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        System.out.print("How many sided die do you want to roll?: ");
        int sides = s.nextInt();
        s.nextLine();
        System.out.print("\nRoll the dices? (c to cancel): ");
        String userResponse = s.nextLine();
        if (userResponse.equals("c")) {
            return;
        }
        int d1 = rollDie(sides);
        int d2 = rollDie(sides);
        System.out.printf("%nYou rolled %d, %d%n", d1, d2);
        System.out.print("Would you like to go again? (y/n):");
        String a = s.nextLine();
        if (a.equals("y")) {
            rollDiceApp();
        }
    }

    private static int rollDie(int sides) {
        return (int)(Math.random() * sides + 1);
    }
}
