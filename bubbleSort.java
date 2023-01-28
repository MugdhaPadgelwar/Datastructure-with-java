import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 78, 90, 34, 23, 14, 55, 1 };
        bubbleSortt(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortt(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}

