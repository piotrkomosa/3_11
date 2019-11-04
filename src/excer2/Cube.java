package excer2;

public class Cube extends Shape3D {

    private int cubeSideA;
    private int cubeSideB;
    private int cubeSideC;

    public Cube(int cubeSideA, int cubeSideB, int cubeSideC) {
        this.cubeSideA = cubeSideA;
        this.cubeSideB = cubeSideB;
        this.cubeSideC = cubeSideC;
    }

    public int getCubeSideA() {
        return cubeSideA;
    }

    public void setCubeSideA(int cubeSideA) {
        this.cubeSideA = cubeSideA;
    }

    public int getCubeSideB() {
        return cubeSideB;
    }

    public void setCubeSideB(int cubeSideB) {
        this.cubeSideB = cubeSideB;
    }

    public int getCubeSideC() {
        return cubeSideC;
    }

    public void setCubeSideC(int cubeSideC) {
        this.cubeSideC = cubeSideC;
    }

    double cubeVolume(Cube cube){
        return cubeSideA*cubeSideB*cubeSideC;
    }
}
