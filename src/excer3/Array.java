package excer3;

public class Array {

    public int N;

    public Array(int n) {
        N = n;
    }
    public int getN() {
        return N;
    }
    public void setN(int n) {
        N = n;
    }
    public void moveArray(int[] array, int N) {
        if (N >= array.length) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
        } else if (N <= 0) {
            for (int i = 0; i < array.length; i++) {

                System.out.print(array[i] + ", ");
            }
        } else
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + N + ", ");
            }
        System.out.println();
    }
}
