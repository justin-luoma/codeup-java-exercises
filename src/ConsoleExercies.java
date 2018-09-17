import java.util.Scanner;

public class ConsoleExercies {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of PI is approximately %.2f.%n", pi);

        Scanner s = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInt = s.nextInt();
//        System.out.printf("You entered %d.%n", userInt);
//
//        System.out.print("Enter three words separated by a space: ");
//        String s1, s2, s3;
//        s1 = s.next();
//        s2 = s.next();
//        s3 = s.next();
//        System.out.printf("%s%n%s%n%s%n", s1, s2, s3);
//        System.out.print("Enter a sentence: ");
//        String sentence = s.nextLine();
//        System.out.printf("You entered: %s%n", sentence);
        System.out.print("Enter the length of the room: ");
        int length = Integer.parseInt(s.nextLine());
        System.out.print("Enter the width of the room: ");
        int width = Integer.parseInt(s.nextLine());
        System.out.printf("The area of the room is: %d", length*width);
    }
}
 /*
 * Explore the Scanner Class

Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

What happens if you input something that is not an integer?
Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.

What happens if you enter less than 3 words?
What happens if you enter more than 3 words?
Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.

do you capture all of the words?
Rewrite the above example using the .nextLine method.

Calculate the perimeter and area of Codeup's classrooms

Prompt the user to enter values of length and width of a classroom at Codeup.

Use the .nextLine method to get user input and cast the resulting string to a numeric type.

Assume that the rooms are perfect rectangles.
Assume that the user will enter valid numeric data for length and width.
Display the area and perimeter of that classroom.

The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

Bonuses

Accept decimal entries
Calculate the volume of the rooms in addition to the area and perimeter
The Scanner class can be told specifically what characters or pattern separates tokens in a piece
of input with the useDelimeter method. Add the following line of code to your application after you have
created a scanner (assuming the variable the holds the scanner is named scanner):


scanner.useDelimeter("\n");
How does this change the way your program operates?

Rewrite your classroom calculating program to use nextInt method. If you added the line of code above to your
application, you should now have no trouble handling multiple pieces of user input.
 * */