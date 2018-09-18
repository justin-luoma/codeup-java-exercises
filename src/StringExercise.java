public class StringExercise {
    public static void main(String[] args) {
        /*String Basics. Create a class named StringExercise with a main method.

For each of the following output examples, create a string variable named message that contains the desired output
and print it out to the console.

Do this with only one string variable and one print statement.


We don't need no education
We don't need no thought control

Check "this" out!, "s inside of "s!

In windows, the main drive is usually C:\

I can do backslashes \, double backslashes \\,
and the amazing triple backslash \\\!*/

        String message = "We don't need no education";
        System.out.printf("%s%n%s%n", message, message.replace("education", "thought control"));

        String message1 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message1);

        String message2 = "In windows, the main drive is usually C:\\";
        System.out.println(message2);

        String message3 = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(message3);
    }
}
