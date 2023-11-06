package animals;

public class test {

    public static void main(String[] args) {
        faveAminal dog = new faveAminal("dog", "ruff");
//        faveAminal dog = new faveAminal();
//        dog.name = "dog";
//        dog.sound = "ruff";
        System.out.println(dog.makeNoise());

        faveAminal cat = new faveAminal("cat", "purr");
//        faveAminal cat = new faveAminal();
//        cat.name = "cat";
//        cat.sound = "purr";
        System.out.println(cat.makeNoise());

        faveAminal lyger = new faveAminal("lyger", "grawwrg");
//        faveAminal lyger = new faveAminal();
//        lyger.name = "lyger";
//        lyger.sound = "rawr?";
        System.out.println(lyger.makeNoise());

        faveAminal bee = new faveAminal("bee", "bzzzz");
//        faveAminal bee = new faveAminal();
//        bee.name = "bee";
//        bee.sound = "bzzzzz";
        System.out.println(bee.makeNoise());

        faveAminal butterfly = new faveAminal("butterfly", "whisp");
        System.out.println(butterfly.makeNoise());
    }
}
