package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public abstract double length();
    public abstract double width();


    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }




    //GETTERS<->SETTERS\\
    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2*length)+(2*width);
    }
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
}
