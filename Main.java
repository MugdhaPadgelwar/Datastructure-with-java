import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Arrays.sort(a);
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= m) {
                m -= a[i];
            } else {
                s += a[i] - m;
                m = 0;
            }
        }
        if (m != 0) {
            System.out.println(-1);
        } else {
            System.out.println(s);
        }
    }
}
