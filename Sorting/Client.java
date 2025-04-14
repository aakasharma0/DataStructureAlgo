public class Client {
    public static void main(String[] args) {
        // Sorting sorting = new SelectionSort();
        Sorting sorting = new HeapSort();
        sorting.sort();
        sorting.printArray();
    }
}
