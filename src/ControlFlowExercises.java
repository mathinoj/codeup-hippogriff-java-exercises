public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        //    A do or do-while loop is the same as a while loop, except that the body of the loop will execute before the condition is evaluated.

//    You should use a do loop over a while loop if you want the code inside the body of the loop to evaluate at least once, or you want to the loop body to be evaluated before the loop condition.

//            do {
//        System.out.println("You will see this despite the condition!");
//    } while (false);
        int doWhile = 1;
        do{
            System.out.println(doWhile*2);
            doWhile++;
        }
        while(doWhile*2 <= 100);






    }
}
