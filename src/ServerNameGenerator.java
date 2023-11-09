import org.w3c.dom.ls.LSOutput;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"jump", "walk", "crawl", "run", "lay", "sleep", "roll", "flop", "stand", "sit"};
        String[] nouns = {"store", "woman", "ball", "plane", "restaurant", "baby", "pen", "shoe", "room", "man"};

        String adj = pickRandomString(adjectives);
        String noun = pickRandomString(nouns);


        System.out.println("Here is your server name: ");
        System.out.println(adj + "-" + noun);

    }

    //Create a method that will return a random element from an array of >>>>>>>>>strings<<<<<<<<<.
    private static String pickRandomString(String [] strings) {
                int randoAdj = (int) Math.floor(Math.random() * strings.length -1);
//        System.out.println(randoAdj);
        return strings[randoAdj];
    }

}
