import java.util.Arrays;

public class ArrayExercises {
    //PUBLIC STATIC - can be accessed from within the class as well as outside the class.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers);


//Create an array that holds 3 Person objects.
//Assign a new instance of the Person class to each element.
        Person[] persons = new Person[3];
//        System.out.println("purse: " +Arrays.toString(persons));
        persons[0] = new Person("sy");
        persons[1] = new Person("jose");
        persons[2] = new Person("chris");
//        System.out.println("purse: " +Arrays.toString(persons));


        printPeeps(persons);

        Person[] addOnePerson = addPerson(persons, new Person("j-dub"));

        printPeeps(addOnePerson);
    }

    //
    //PRIVATE STATIC - can be access from within the class only.
    //
    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    private static Person[] addPerson(Person[] currentArrayOfPeeps, Person addOnePerson){
        Person[] arrayWithNewPersonAdded = Arrays.copyOf(currentArrayOfPeeps, currentArrayOfPeeps.length +1);

        arrayWithNewPersonAdded[arrayWithNewPersonAdded.length-1] = addOnePerson;

        return arrayWithNewPersonAdded;
    }

    private static void printPeeps(Person[] printPeopleArray){
        for(Person person : printPeopleArray){
            System.out.println(person);
        }
    }




}
