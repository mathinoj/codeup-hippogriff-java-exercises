package animals;

//Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.

public class faveAminal {
    private String name;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String makeNoise(){
        return String.format("A %s goes %s.", name, sound);
    }

    public faveAminal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
}
