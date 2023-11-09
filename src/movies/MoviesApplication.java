package movies;
import utils.Input;
public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
//        int selection = input.getInt(0, 5, "Select choice: ");




    }

    private static void printMenu(){
        System.out.println("What would you like to do? ");
        System.out.println();
        System.out.println(" 0 - exit\n" +
                " 1 - view all movies\n" +
                " 2 - view movies in the animated category\n" +
                " 3 - view movies in the drama category\n" +
                " 4 - view movies in the horror category\n" +
                " 5 - view movies in the scifi category"
        );
    }
}
