package shapes;
import utils.Input;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*(radius*radius);
    }
    public double getCircumference(){
       return 2*Math.PI*(radius);
    }

//    public Circle(){}

//    public Circle(double radius){
//        this.radius = radius;
//    }



}
