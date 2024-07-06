package org.example;

import java.util.Arrays;

public class AggressiveCow {
    public static int placeCows(int[] stalls, int k) {
        if( stalls.length == 1 && k == 1) return 0;
        int ans = -1;
        Arrays.sort(stalls);
        int start = 0;
        int end = stalls[stalls.length - 1] - stalls[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(stalls, k, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;


    }

    public static boolean isPossible(int[] stalls, int k, int mid) {
        int cowCount = 1;
        int lastPosition = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= mid) {
                cowCount++;
                if (cowCount == k) {
                    return true;
                }
                lastPosition = stalls[i];
            }


        }
        return false;
    }

    public static void test(int[] stalls, int k, int expectedValue) {
        int result = placeCows(stalls, k);
        System.out.println("Stalls: " + Arrays.toString(stalls) + ", Cows: " + k + ", Expected: " + expectedValue + ", Result: " + result);
    }

    public static void main(String[] args) {
        testEdgeCases();
    }

    public static void testEdgeCases() {
        // Edge Case 1: Minimum Input Values
        test(new int[]{1}, 1, 0);

        // Edge Case 2: Maximum Number of Stalls with Minimum Distance
        test(new int[]{1, 1, 1, 1}, 2, 0);

        // Edge Case 3: Stalls Positioned at Extremes
        test(new int[]{1, 1000000000}, 2, 999999999);

        // Edge Case 4: Cows Equal to Stalls
        test(new int[]{1, 2, 3, 4, 5}, 5, 1);

        // Edge Case 5: Cows More Than Stalls
        test(new int[]{1, 2, 3}, 4, -1); // Assuming we return -1 for invalid inputs

        // Edge Case 6: All Stalls at Equal Distance
        test(new int[]{1, 3, 5, 7, 9}, 3, 4);

        // Edge Case 7: Stalls at Prime Numbers
        test(new int[]{2, 3, 5, 7, 11, 13}, 3, 5);
    }


}
