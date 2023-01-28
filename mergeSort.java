import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 67, 1, 34, 23, 89, 80, 65, 84 };
        arr = mergeSortt(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSortt(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSortt(Arrays.copyOfRange(arr, 0, mid));
        int[] rigth = mergeSortt(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, rigth);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];

            j++;
            k++;
        }
        return mix;
    }

    
}
