package shapes;
import utils.Input;
public class CircleApp {
    public static void main(String[] args) {

        Input circleArea = new Input();


        System.out.println("Enter a circles radius: ");
        Circle area = new Circle(circleArea.getDouble());
        System.out.println("This is area: " +area.getArea());
        System.out.println("This is circumference: " +area.getCircumference());


    }
}
