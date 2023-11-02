import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        String userChoice = "";
        Scanner yesNo = new Scanner(System.in);
        do {
        Scanner askBob = new Scanner(System.in);
            System.out.print("Ask Bob a q: ");
            String yourQ = askBob.nextLine();
            if (yourQ.endsWith("?")) {
                System.out.println("Sure.");
            } else if (yourQ.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (yourQ.isEmpty()) {
                System.out.println("Fine. Be that guey!");
            } else {
                System.out.println("Whatevz.");
            }
            System.out.println("Ask Bob more? [y/n]");
            userChoice = yesNo.next();
        }while(userChoice.equals("y"));

    }
}
