import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayExercises {
//    int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(numbers);



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers);




//Create an array that holds 3 Person objects.
//Assign a new instance of the Person class to each element.
//        Person sy = new Person("sy");
//        Person jose = new Person("jose");
//        Person chris = new Person("chris");
//        Person[] persons = {sy, jose, chris};
//        STEP 1 - makes space to store 3 references of peeps
        Person[] persons = new Person[3];
        persons[0] = new Person("sy");
        persons[1] = new Person("jose");
        persons[2] = new Person("chris");

//        Person jdub = new Person("j-dub");
//        persons = Person.addPerson(persons, jdub);
//
        Person meech = new Person("big meech");
        persons = Person.addPerson(persons, meech);

        Person x = new Person("x");
        persons = Person.addPerson(persons, x);
////        STEP 2
//        Person[] morePeeps =;
//
//                private static Person[] addPerson(Person[] ppl, Person persons){
//            Person[] morePpl = null;
//            return morePpl;
//        }

        for (Person peep : persons){
            System.out.printf("Name: %s%n", peep.getName());
        }





    }
}
