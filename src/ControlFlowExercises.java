import java.util.Arrays;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        for(int i=5; i<=15; i++){
//            System.out.println(i);
//        }

//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//    } while (false);
//        int doWhile = 0;
//        do{
//            System.out.println(doWhile*2);
//            doWhile++;
//        }
//        while(doWhile*2 <= 100);

//        for(int i=0; i<=100; i++){
//            System.out.println(i++);
//        }


        //Alter your loop to count backwards by 5's from 100 to -10.
//        int backWards = 100;
//        do{
//            System.out.println(backWards);
//            backWards -= 5;
//        }
//        while (backWards >= -10);

//        for(int i=100; i>=-10; i-=5){
//            System.out.println(i);
//        }

//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long squareTwo = 2;
//        do{
//            System.out.println(squareTwo);
//            squareTwo*=squareTwo;
//        }
//        while (squareTwo < 1000000);

        for(long i=2; i<1000000; i*=i){
            System.out.println(i);
        }


//        for(int i=1; i<=100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println(i + ": FiZzBuZz");
//            }else if(i % 3 == 0){
//                System.out.println(i + ": fIzZ");
//            } else if (i % 5 == 0) {
//                System.out.println(i + ": BuZz");
//            } else {
//                System.out.println(i);
//            }
//        }

String userChoice = "";
Scanner yesNo = new Scanner(System.in);
    do {
        Scanner promptNumb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numbInput = Integer.parseInt(promptNumb.nextLine());
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (long i = 1; i <= numbInput; i++) {
            System.out.printf("%-7d| %-8d| %-5d\n", i, i * i, i * i * i);
        }
        System.out.println("Would you like to enter another number, Y or N?");
        userChoice = yesNo.next();
    } while(userChoice.equals("y") || userChoice.equals("yes"));









    }
}
