package excer3;

public class ArrayTest {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        Array array = new Array(0);
        array.moveArray(array1,3);
        array.moveArray(array2,4);
    }
}
