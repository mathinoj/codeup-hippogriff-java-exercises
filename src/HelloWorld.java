public class HelloWorld {
    //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
    public static void main(String[] args) {
//        System.out.println("Hello,");
//        System.out.println("World!");
        int myFavoriteNumber = 1985;
        String myString = "your strang";
        double myNumber = 3.14;
//        int x = 5;
//        String class = "class";


//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //^^^String cant be cast to java integer.

//        int three = (int) "three";
        //^^^String cant be converted to int.

//        int x = 4;
////        x = x + 5;
//        x += 5;


//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        byte biter = 127;
        //^^^^Incombatible types: possible lossy conversion from int to byte. For the numeric types in Java, you can always assign a value of lesser precision to a type of greater precision, but not the other way around. For example, the value 128 could be a short or an int, but not a byte.

        System.out.println("My fave numb is: " +myFavoriteNumber);
        System.out.println("This is... " +myString);
        System.out.println("My numb: " +myNumber);
//        System.out.println(++x);
//        System.out.println(x);
//        System.out.println("the3: " +theNumberThree);
//        System.out.println("object O: " +o);
//        System.out.println("tree: " +three);
//        System.out.println(three);
        System.out.println(x);
        System.out.println(y);
        System.out.println(++biter);


    }




}
