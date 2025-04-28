public class Client {
    public static void main(String[] args) {
        // Sorting sorting = new SelectionSort();
        Sorting sorting = new CountSort();
        sorting.sort();
        sorting.printArray();
    }
}
