import java.util.Arrays;
public class SearchIn2D {
    public static void main(String[] args) {

        int[][] array = {
                { 45, 67, 8 },
                { 54, 2, 1 },
                { 4, 8, 90 }
        };
        int target = 67;

        int[] ans = intSearch(array, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] intSearch(int[][] arr, int target) {
        for (int rol = 0; rol < arr.length; rol++) {
            for (int col = 0; col < arr[rol].length; col++) {
                if (arr[rol][col] == target) {
                    return new int[] { rol, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    
}
