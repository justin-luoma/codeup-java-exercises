package util;

import java.util.Scanner;

public class Input {
    /*Create directory inside of src named util. Inside of util, create a
    class named Input that has a private property named scanner. When an
    instance of this object is created, the scanner property should be set to
     a new instance of the Scanner class. The class should have the following
      methods, all of which return command line input from the user:

        String getString()
        boolean yesNo()
        int getInt(int min, int max)
        int getInt()
        double getDouble(double min, double max)
        double getDouble()
        The yesNo method should return true if the user enters y, yes, or
        variants thereof, and false otherwise.

        The getInt(int min, int max) method should keep prompting the user
        for input until they give an integer within the min and max. The
        getDouble method should do the same thing, but with decimal numbers.

        Create another class named InputTest that has a static main method
        that uses all of the methods from the Input class.

        Bonus

        Allow all of your methods for getting input to accept an optional
        string parameter named prompt. If passed, the method should show the
        given prompt to the user before parsing the input.*/
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return this.getString();
    }

    public boolean yesNo() {
        return this.scanner.nextLine().matches(".*((\\W|^)[Yy][eE][sS](\\W|$)).*|.*((\\W|^)[Yy](\\W|$)).*|^[yY][eE][sS]$|^[yY]$");
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return this.yesNo();
    }

    public int getInt() {
        while (!this.scanner.hasNextInt()) {
            System.out.println("invalid input");
            this.scanner.next();
        }
        return this.scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return this.getInt();
    }

    public int getInt(int min, int max) {
        int number = this.getInt();
        while (number < min || number > max) {
            System.out.println("out of range");
            number = this.getInt();
        }
        return number;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        return this.getInt(min, max);
    }

    public double getDouble() {
        while (!this.scanner.hasNextDouble()) {
            System.out.println("invalid input");
            this.scanner.next();
        }
        return this.scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return this.getDouble();
    }

    public double getDouble(double min, double max) {
        double number = this.getDouble();
        while (number < min || number > max) {
            System.out.println("out of range");
            number = this.getDouble();
        }
        return number;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.print(prompt);
        return this.getDouble(min, max);
    }
}

class TextInput {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.print("enter string: ");
//        String s = input.getString();
//        System.out.println(s);
//
//        System.out.print("enter int: ");
//        int i = input.getInt();
//        System.out.println(i);
//
//        System.out.print("enter int 1 - 10: ");
//        int j = input.getInt(1, 10);
//        System.out.println(j);
//
//        System.out.print("enter double: ");
//        double d = input.getDouble();
//        System.out.println(d);
//
//        System.out.print("enter double 1.1 - 10.2: ");
//        double dd = input.getDouble(1.1, 10.2);
//        System.out.println(dd);

//        System.out.print("yes or no: ");
//        System.out.println(input.yesNo());
//        System.out.println(input.yesNo("Would you like to continue? "));
    }
}