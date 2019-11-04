package excer2;

public class Line2D extends Shape2D {

    private double X1;
    private double Y1;
    private double X2;
    private double Y2;


    public Line2D(double x1, double y1, double x2, double y2) {
        X1 = x1;
        Y1 = y1;
        X2 = x2;
        Y2 = y2;
    }

    public double getX1() {
        return X1;
    }

    public double getY1() {
        return Y1;
    }

    public double getX2() {
        return X2;
    }

    public double getY2() {
        return Y2;
    }

    double lineLenght(Line2D line){

        return Math.sqrt((X1 - X2) * (X1 - X2) + (Y2 - Y1) * (Y2 - Y1));
    }
}
