import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {4, 2, 5, 1, 7};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void sort(int[] array) {
        boolean sortInProgress = true;
        while (sortInProgress) {
            sortInProgress = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sortInProgress = true;
                }
            }
        }
    }

}
