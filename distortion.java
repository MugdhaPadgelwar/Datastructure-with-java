import java.util.Scanner;

public class distortion {
    public static int calculateDistortion(int[][] matrix) {
        int distortion = 0;

        for (int i = 1; i < matrix.length; ++i) {
            int totalIssuesPrev = 0;
            int totalIssuesCurrent = 0;

            for (int j = 0; j < 5; ++j) {
                totalIssuesPrev += matrix[i - 1][j];
                totalIssuesCurrent += matrix[i][j];
            }

            if (totalIssuesCurrent > totalIssuesPrev) {
                distortion += totalIssuesCurrent - totalIssuesPrev;
            }
        }

        return distortion;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] matrix = new int[N][5];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < 5; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int distortion = calculateDistortion(matrix);
        System.out.println(distortion);
    }
}
