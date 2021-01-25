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
        int iteration = 0;
        int sortingRange = array.length;
        while (sortInProgress) {
            sortInProgress = false;
            for (int i = 0; i < sortingRange - 1; i++) {
                iteration++;
                System.out.print("Porównanie " + iteration + ") " + array[i] + " vs " + array[i + 1]);
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    System.out.print(" - zmiana i tablica to teraz: " + Arrays.toString(array) + "\n");
                    sortInProgress = true;
                } else {
                    System.out.println();
                }
            }
            sortingRange--;
        }
    }

}
