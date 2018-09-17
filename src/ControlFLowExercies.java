import java.util.Scanner;

public class ControlFLowExercies {
    public static void main(String[] args) {
        /*While

Create an integer variable i with a value of 5.
Create a while loop that runs so long as i is less than or equal to 15
Each loop iteration, output the current value of i, then increment i by one.
Your output should look like this:

5 6 7 8 9 10 11 12 13 14 15*/
        int i = 5;
        while (i <= 15) {
            System.out.printf("%d ", i);
            i++;
        }
        System.out.println();
        /*Do While

Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
Alter your loop to count backwards by 5's from 100 to -10.
Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

 2
 4
 16
 256
 65536
*/
//        int j = 0;
        int j = 100;
        do {
            System.out.println(j);
            j -= 5;
//            j += 2;
//        } while (j <= 100);
        } while (j >= -10);

        double k = 2;
        do {
            System.out.println((int)k);
//            k = Math.pow(k, 2);
            k *= k;
        } while (k < 1000000);

        /*For

refactor the previous two exercises to use a for loop instead*/
        for (int fI = 5; fI <= 15; fI++) {
            System.out.printf("%d ", fI);
        }

        for (int fJ = 100; fJ >= -10; fJ -= 5) {
            System.out.println(fJ);
        }

        for (double fK = 2; fK < 1000000; fK *= fK) {
            System.out.println((int)fK);
        }

        for (int f = 1; f <= 100; f++) {
            if (f % 3 == 0 && f % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (f % 3 == 0) {
                System.out.println("fizz");
            } else if (f % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(f);
            }
        }

//        Scanner s = new Scanner(System.in);
//
//        System.out.print("What number would you like to go up to? ");
//        int num = s.nextInt();

        System.out.println("\nHere is your table!\n");
        System.out.println("number | squared | cubed");
        System.out.println("______ | _______ | _____");
        for (int iN = 1; iN <= 5; iN++) {
            int squared = (int)Math.pow(iN, 2);
            int cubed = (int)Math.pow(iN, 3);
            System.out.printf("%-6d | %-7d | %-5d%n", iN, squared, cubed);
        }

        /*Convert given number grades into letter grades.

        Prompt the user for a numerical grade from 0 to 100.
        Display the corresponding letter grade.
        Prompt the user to continue.
        Assume that the user will enter valid integers for the grades.
        The application should only continue if the user agrees to.
        Grade Ranges:

        A : 100 - 88
        B : 87 - 80
        C : 79 - 67
        D : 66 - 60
        F : 59 - 0
        Bonus

        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).*/
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number grade: ");
        
    }
}
