public class Person {
    private String name;

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

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }
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
