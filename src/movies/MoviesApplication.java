package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        boolean stop = false;
        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a new movie");
            System.out.print("\nEnter your choice: ");
            switch (input.getInt()) {
                case 0:
                    stop = true;
                    break;
                case 1:
                    System.out.println(String.join("\n", MoviesArray.moviesToString())+"\n");
                    break;
                case 2:
                    System.out.println(String.join("\n", MoviesArray.moviesToString("animated"))+"\n");
                    break;
                case 3:
                    System.out.println(String.join("\n", MoviesArray.moviesToString("drama"))+"\n");
                    break;
                case 4:
                    System.out.println(String.join("\n", MoviesArray.moviesToString("horror"))+"\n");
                    break;
                case 5:
                    System.out.println(String.join("\n", MoviesArray.moviesToString("scifi"))+"\n");
                    break;
                case 6:
                    MoviesArray.addMovie(input.getString("\nMovie Name: "),input.getString("\nMovie Category: 6"));
                    break;
                default:
                    break;
            }
        } while (!stop);

    }
}
