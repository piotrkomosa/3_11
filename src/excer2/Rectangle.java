package excer2;

public class Rectangle extends GeometricShape implements Calc2D {

    public double rectangleArea;
    private int rectangleSideA;
    private int rectangleSideB;

    public Rectangle(int rectangleSideA, int rectangleSideB) {
        this.rectangleSideA = rectangleSideA;
        this.rectangleSideB = rectangleSideB;
    }

    public int getRectangleSideA() {
        return rectangleSideA;
    }

    public void setRectangleSideA(int rectangleSideA) {
        this.rectangleSideA = rectangleSideA;
    }

    public int getRectangleSideB() {
        return rectangleSideB;
    }

    public void setRectangleSideB(int rectangleSideB) {
        this.rectangleSideB = rectangleSideB;
    }

    public double rectangleArea(){
        return rectangleSideA*rectangleSideB;
    }

    @Override
    public double circleArea(Circle circle) {
        return 0;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return 0;
    }
}
