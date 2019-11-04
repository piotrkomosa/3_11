package excer2;

public class Ball extends Shape3D {

    private int ballRadius;

    public Ball(int ballRadius) {
        this.ballRadius = ballRadius;
    }

    public int getBallRadius() {
        return ballRadius;
    }

    public void setBallRadius(int ballRadius) {
        this.ballRadius = ballRadius;
    }
    double ballVolume(Ball ball){
        return (Math.pow(ballRadius, 3) * Math.PI) * 4 / 3;
    }

}




