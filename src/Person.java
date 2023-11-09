import java.util.Arrays;

public class Person {
//    private static int totalPersons;
    private String name;

//    public static int getTotalPersons(){
//        return totalPersons;
//    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
//    public String sayHello(){
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("There goes " + name +"!");
    }


    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] existingPerson, Person newPerson){
        Person[] updatedPersons = Arrays.copyOf(existingPerson,existingPerson.length + 1);

        updatedPersons[updatedPersons.length - 1] = newPerson;

        return updatedPersons;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(){
//        totalPersons++;
    }

    public Person(String name){
//        totalPersons++;
        this.name = name;
    }
    //THESE TWO WERE DONE I THINK TO SIMPLIFY ADDING new Person, as SEEN IN THE SECOND new instance BELOW.
    public static void main(String[] args) {
        Person mutt = new Person();
        mutt.setName("Bigg Mutt Dawg");
        mutt.sayHello();

//        Person matt = new Person();
//        matt.setName("Big Mat Dogg");
//        matt.sayHello();
        Person matt = new Person("Big Mat Dogg");
        matt.sayHello();

    }



}
