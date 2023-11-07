import utils.Input;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String inputString = input.getString();
        System.out.println("Your String = " +inputString);
//
//
//        boolean likeStuff = input.yesNo();
//        System.out.println("likeStuff = " +likeStuff);
//
//
//        int minMaxNumb = input.getInt(1, 100);
//        System.out.println("minMaxNumb = " +minMaxNumb);
//
//        int whatsInt = input.getInt();
//        System.out.println("This is the int: " +whatsInt);


//        double decDub = input.getDouble(1, 100);
//        System.out.println("decDub = " +decDub);
//
//        System.out.println("Enter an integer:");
        double whatDub = input.getDouble();
        System.out.println("whatDub: " +whatDub);



    }
}
