import java.util.Arrays;

public class TunnelTraversal {

    public static int getSpillage(int[] waterNeed, int maxTrips) {
        int low = 1;
        int high = Arrays.stream(waterNeed).max().getAsInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canDeliver(waterNeed, maxTrips, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (canDeliver(waterNeed, maxTrips, low)) {
            int totalSpillage = 0;
            for (int water : waterNeed) {
                int requiredTrips = (water + low - 1) / low;
                totalSpillage += (requiredTrips * low) - water;
            }
            return totalSpillage;
        } else {
            return -1;
        }
    }

    private static boolean canDeliver(int[] waterNeed, int maxTrips, int capacity) {
        int trips = 0;
        for (int water : waterNeed) {
            int requiredTrips = (water + capacity - 1) / capacity;
            trips += requiredTrips;
        }
        return trips <= maxTrips;
    }