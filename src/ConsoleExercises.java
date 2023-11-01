import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("Dis pi: " +pi);
        System.out.printf("This is new pi: %.2f%n", pi);
//        https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java


        Scanner scannerExplore = new Scanner(System.in);
        System.out.print("Enter an integer: ");
//        int userInput = scannerExplore.nextInt();
        String userInput = scannerExplore.nextLine();
        //int userInput = Integer.parseInt(scannerExplore.nextLine());
        int userInputToInt = Integer.parseInt(userInput);

        System.out.printf("You entered: %d%n", userInputToInt);

//        Scanner scannerExplore = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String userInput = scannerExplore.nextLine();
//        System.out.println("Hello " + userInput + "!");

        Scanner wordScanner = new Scanner(System.in);
        System.out.print("Enter 3 words here: ");
        String userInput1 = wordScanner.next();
        String userInput2 = wordScanner.next();
        String userInput3 = wordScanner.next();
        System.out.printf("Word 1: %s%nWord 2: %s%nWord 3: %s%n", userInput1, userInput2, userInput3);
//        System.out.printf("Word 2: %s%n", userInput2);

        Scanner sentenceScanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sentenceScanner.nextLine();
        System.out.printf("Here you doh: %s%n", sentence);

        Scanner lengthWidth = new Scanner(System.in);
        System.out.print("Enter length: ");
        String length = lengthWidth.nextLine();
        System.out.print("Enter width: ");
        String width = lengthWidth.nextLine();
        int lengthToInt = Integer.parseInt(length);
        int widthToInt = Integer.parseInt(width);
        System.out.printf("Area is: " +lengthToInt*widthToInt +"%n");
        int perimeter = (lengthToInt*2) + (widthToInt*2);
        System.out.printf("Perimeter is: %d%n", perimeter);

    }
}
