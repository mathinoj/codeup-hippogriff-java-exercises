package animals;

public class test {

    public static void main(String[] args) {
        faveAminal dog = new faveAminal();
        dog.name = "dog";
        dog.sound = "ruff";
        System.out.println(dog.makeNoise());

        faveAminal cat = new faveAminal();
        cat.name = "cat";
        cat.sound = "purr";
        System.out.println(cat.makeNoise());

        faveAminal lyger = new faveAminal();
        lyger.name = "lyger";
        lyger.sound = "rawr?";
        System.out.println(lyger.makeNoise());
    }
}
