public class binearSearch {
    
        public static void main(String[] args) {
            int[] array = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
            int target = 9;
            int ans = searchBinary(array, target);
            System.out.println(ans);
        }
    
        static int searchBinary(int[] arr, int target) {
            int start = arr[0];
            int end = arr.length - 1;
    
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
    
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
    
            return -1;
        }
    
    }
    
