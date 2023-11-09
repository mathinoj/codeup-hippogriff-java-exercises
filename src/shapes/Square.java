package shapes;

public class Square extends Quadrilateral {
    protected double length;
    protected double width;

    public Square(double length, double width) {
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


//    private int side;
//public Square(int side) {
////    public Square(int length, int width, int side) {
//    super(side, side);
////        super(length, width);
//        this.side = side;
//    }
//
//    @Override
//    public int getArea() {
//        System.out.println("getArea from Square");
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        System.out.println("getPerim from Square");
//        return 4 * side;
//    }


}
