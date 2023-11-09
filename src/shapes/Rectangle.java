package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double length() {
        return length;
    }

    @Override
    public double width() {
        return width;
    }

//    protected int length;
//    protected int width;
//
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2*length)+(2*width);
//    }
//
//
////CONSTRUCTOR
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }




}
