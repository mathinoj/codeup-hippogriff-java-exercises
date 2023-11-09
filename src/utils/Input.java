package utils;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;
//    private String string;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

//    public String getString(String prompt){
//        System.out.println(prompt);
//        return this.scanner.nextLine();
//    }
    public boolean yesNo() {
        System.out.println("Do you like stuff?");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int userInt;
        do {
            System.out.printf("Enter a number between %d and %d: %n", min, max);
            userInt = Integer.parseInt(scanner.nextLine());
//            userInt = scanner.nextInt(); //
        } while (userInt > max || userInt < min);
        return userInt;
    }

       public int getInt() {
       System.out.println("Enter a integer:");
        return Integer.parseInt(String.valueOf(this.scanner.nextLine()));
//           return Integer.parseInt(this.scanner.nextInt());
   }
    public double getDouble(double min, double max){
        double userDouble;
        do{
            System.out.printf("Enter a number between %f and %f: %n", min, max);
           userDouble = Double.parseDouble(scanner.nextLine());
        } while(userDouble > max || userDouble < min);
        return userDouble;
    }

      public double getDouble(){
          System.out.println("Enter an integer:");
          return Double.parseDouble(String.valueOf(this.scanner.nextLine()));
//          return scanner.nextDouble();
//          ^^THIS IS WHAT JAVIER USED^^
      }


}
