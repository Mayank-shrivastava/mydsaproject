package algorithms;

import java.util.*;

public class MagazineWriting {

    public static int maximumVariety(int N, int M, int[][] A, int[] B) {
        Map<Integer, List<Integer>> colorToInks = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int color = A[i][0];
            int ink = A[i][1];
            colorToInks.putIfAbsent(color, new ArrayList<>());
            colorToInks.get(color).add(ink);
        }

        for (List<Integer> inks : colorToInks.values()) {
            inks.sort(Collections.reverseOrder());
        }

        int left = 0, right = M;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (canWriteMagazines(mid, colorToInks, B)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private static boolean canWriteMagazines(int numMagazines, Map<Integer, List<Integer>> colorToInks, int[] B) {
        int totalColors = colorToInks.size();
        if (numMagazines > totalColors) {
            return false;
        }

        List<Integer> allInks = new ArrayList<>();
        for (List<Integer> inks : colorToInks.values()) {
            for (int i = 0; i < Math.min(numMagazines, inks.size()); i++) {
                allInks.add(inks.get(i));
            }
        }

        allInks.sort(Collections.reverseOrder());

        int totalInkNeeded = 0;
        for (int i = 0; i < numMagazines; i++) {
            totalInkNeeded += B[i];
        }

        int totalInkUsed = 0;
        for (int i = 0; i < numMagazines && i < allInks.size(); i++) {
            totalInkUsed += allInks.get(i);
            if (totalInkUsed >= totalInkNeeded) {
                return true;
            }
        }

        return totalInkUsed >= totalInkNeeded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[][] A = new int[N][2];
            for (int i = 0; i < N; i++) {
                A[i][0] = scanner.nextInt();
                A[i][1] = scanner.nextInt();
            }
            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = scanner.nextInt();
            }

            System.out.println(maximumVariety(N, M, A, B));
        }
        scanner.close();
    }
}