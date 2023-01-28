public class linearSearchAlgo {
    

public static void main(String[] args) {
    int[] array = { 34, 67, 78, 90, 43, 12 };
    int target = 12;
    // int ans = linearSearch(array, target);
    // System.out.println(ans);
    // int ans2 = linearSearch2(array, target);
    // System.out.println(ans2);

    // String name = "Mugdha";
    // char tar = 'g';
    // boolean print = stringSearch(name, tar);
    // System.out.println(print);

    boolean ans = searchInRange(array, target, 2, 5);
    System.out.println(ans);

}

static int linearSearch(int[] arr, int target) {
    // base condition
    if (arr.length == 0) {
        return -1;
    }
    // iterate the loop through entire array
    for (int index = 0; index < arr.length; index++) {
        int element = arr[index];
        // check if element in array is equal to target
        if (element == target) {
            return index;

        }

    }
    return -1;
}

// if found the target return the element
static int linearSearch2(int[] arr, int target) {
    if (arr.length == 0) {
        return -1;
    }
    for (int i = 0; i < arr.length; i++) {
        int element = arr[i];
        if (element == target) {
            return element;
        }
    }
    return Integer.MAX_VALUE;
}

// search in string
static boolean stringSearch(String str, char target) {
    if (str.length() == 0) {
        return false;
    }
    for (int i = 0; i < str.length(); i++) {
        if (target == str.charAt(i)) {
            return true;
        }
    }
    return false;
}

// search in range

static boolean searchInRange(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
        return false;
    }
    for (int i = start; i < end; i++) {
        if (arr[i] == target) {
            return true;
        }
    }
    return false;
}
}
