import java.util.Arrays;

public abstract class Sorting {
    int arr[];

    public Sorting() {
        arr = new int[] { 3, 2, 1, 4, 1, 5, 2, 6, 4 };
    }

    public abstract void sort();

    public void printArray() {
        System.out.println(Arrays.toString(arr));

    }
}