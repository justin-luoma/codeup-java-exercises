import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        /*Create a class named Bob with a main method for the following exercise.

Bob is a lackadaisical teenager. In conversation, his responses are very limited.

Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
He answers 'Whatever.' to anything else.
Write the Java code necessary so that a user of your command line application can have a conversation with Bob.*/
        Scanner s = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("What would you like to say to Bob?:\n");
            userInput = s.nextLine();
            switch (userInput.charAt(userInput.length()-1)) {
                case '?':
                    System.out.println("Bob: Sure.");
                    break;
                case '!':
                    System.out.println("Bob: Whoa, chill out!");
                    break;

            }

        } while (!userInput.isEmpty());
    }
}
