import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = new int[100];
        int[] array4 = new int[100];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = i;
            array4[i] = 100 - i;
        }

        sort(array1);
        System.out.println("--------");
        sort(array2);
        System.out.println("--------");
        sort(array3);
        System.out.println("--------");
        sort(array4);


    }

    private static void sort(int[] array) {
        boolean sortInProgress = true;
        int iteration = 0;
        int sortingRange = array.length;
        while (sortInProgress) {
            sortInProgress = false;
            for (int i = 0; i < sortingRange - 1; i++) {
                iteration++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sortInProgress = true;
                }
            }
            sortingRange--;
        }
        System.out.println("liczba porównań: " + iteration);
    }

}
