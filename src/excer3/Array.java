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

    public void moveArray(int[]array, int N) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i+N];
            if(N>= array.length && N<=0){
                System.out.println(array[i]);
            }
            else
                System.out.println(array[N+i]);
        }
    }
}