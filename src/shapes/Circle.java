package shapes;
import utils.Input;

public class Circle {

    private double radius;

    public Circle(){}
    //SETS THE CIRCLE CONSTRUCTOR AND THEN BELOW OVERRIDES IT
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*(Math.pow(radius, 2));
//        return Math.PI*(radius*radius); <<YOUR WAY
    }
    public double getCircumference(){
       return 2*Math.PI*(radius);
    }

//    public Circle(){}

//    public Circle(double radius){
//        this.radius = radius;
//    }



}
