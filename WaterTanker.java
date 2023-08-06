import java.util.Arrays;
import java.util.Scanner;

public class WaterTanker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] villageWaterNeeds = new int[N];

        for (int i = 0; i < N; i++) {
            villageWaterNeeds[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        scanner.close();

        int totalWaterNeeded = Arrays.stream(villageWaterNeeds).sum();
        int lowerBound = 0;
        int upperBound = totalWaterNeeded;
        int result = -1;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;

            if (isFeasible(villageWaterNeeds, M, mid)) {
                result = mid;
                upperBound = mid - 1;
            } else {
                lowerBound = mid + 1;
            }
        }

        if (result == -1) {
            System.out.println(-1);
        } else {
            int spillage = totalWaterNeeded - (result * M);
            System.out.println(spillage);
        }
    }

    private static boolean isFeasible(int[] villageWaterNeeds, int M, int capacity) {
        int trips = 0;
        int currentTankerCapacity = 0;

        for (int villageWaterNeed : villageWaterNeeds) {
            if (villageWaterNeed > capacity) {
                return false;
            }

            if (currentTankerCapacity < villageWaterNeed) {
                currentTankerCapacity = capacity;
                trips++;
            }

            currentTankerCapacity -= villageWaterNeed;
        }

        return trips <= M;
    }
}
