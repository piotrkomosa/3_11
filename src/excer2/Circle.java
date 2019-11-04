package excer2;

public class Circle extends GeometricShape{

    private int circleRadius;


    public Circle(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    double circleArea(Circle circle){
        return Math.pow(circleRadius,2)*Math.PI;
    }
}
