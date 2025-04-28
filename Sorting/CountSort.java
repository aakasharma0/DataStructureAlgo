import java.util.Arrays;

public class CountSort extends Sorting {

    @Override
    public void sort() {

        int largest = Arrays.stream(arr).max().getAsInt();
        int temp[] = new int[largest + 1];

        for (int num : arr) {
            temp[num]++;
        }
        int index = 0;
        for (int i = 0; i <= largest; i++) {
            while (temp[i] > 0) {
                arr[index++] = i;
                temp[i]--;
            }
        }
        System.out.println(arr);
    }

}
