package excer2;

public class Test {
    private static final double PI= Math.PI;
    public static void main(String[] args) {

        Ball ball = new Ball(5);
        Cube cube = new Cube(4, 5, 6);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 8);
        Line2D line = new Line2D(4, 6, 8, 11);
        ballVolume(ball);
        rectangle(rectangle);
        cubeVolume(cube);
        circleArea(circle);
    }

    private static void circleArea(Circle circle) {
        System.out.println(circle.circleArea);
    }

    private static void cubeVolume(Cube cube) {
        System.out.println(cube.cubeVolume);
    }

    private static void rectangle(Rectangle rectangle) {
        System.out.println(rectangle.rectangleArea);
    }
    private static void ballVolume(Ball ball) {
        System.out.println(ball.ballVolume);
    }
}