package dongtaiguihua.advanceagain;

import java.util.Arrays;

/**
 * 假如有一排房子，共 n 个，每个房子可以被粉刷成 k 种颜色中的一种，你需要粉刷所有的房子并且使其相邻的两个房子颜色不能相同。
 * 当然，因为市场上不同颜色油漆的价格不同，所以房子粉刷成不同颜色的花费成本也是不同的。每个房子粉刷成不同颜色的花费是以一个 n x k 的矩阵来表示的。
 * 例如，costs[0][0] 表示第 0 号房子粉刷成 0 号颜色的成本花费；costs[1][2] 表示第 1 号房子粉刷成 2 号颜色的成本花费，以此类推。请你计算出粉刷完所有房子最少的花费成本。
 * 注意：
 * 所有花费均为正整数。
 * <p>
 * 示例：
 * 输入: [[1,5,3],[2,9,4]]
 * 输出: 5
 * 解释: 将 0 号房子粉刷成 0 号颜色，1 号房子粉刷成 2 号颜色。最少花费: 1 + 4 = 5;
 * 或者将 0 号房子粉刷成 2 号颜色，1 号房子粉刷成 0 号颜色。最少花费: 3 + 2 = 5.
 *
 * @author Levy Zhao
 * @since 2021-04-12 11:26
 **/
public class minCostII {

    public static int minCostII(int[][] costs) {
        if (costs.length == 0 || costs[0].length == 0) {
            return 0;
        }

        int n = costs.length, k = costs[0].length;
        int[][] dp = new int[n][k];

        for (int i = 1; i < n; ++i) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < k; ++i) {
            dp[0][i] = costs[0][i];
        }

        for (int i = 1; i < n; i++) {
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < k; j++) {
                if (min1 > dp[i - 1][j]) {
                    min2 = min1;
                    min1 = dp[i - 1][j];
                    minIndex = j;
                } else if (min2 > dp[i - 1][j]) {
                    min2 = dp[i - 1][j];
                }
            }

            for (int j = 0; j < k; j++) {
                if (minIndex != j) {
                    dp[i][j] = min1 + costs[i][j];
                } else {
                    dp[i][j] = min2 + costs[i][j];
                }
            }
        }

        int res = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            res = Math.min(res, dp[n - 1][j]);
        }


        return res;
    }

//    public static int minCostII(int[][] costs) {
//        if (costs.length == 0 || costs[0].length == 0) {
//            return 0;
//        }
//
//        int n = costs.length, k = costs[0].length;
//        int[][] dp = new int[n][k];
//
//        for (int i = 1; i < n; ++i) {
//            Arrays.fill(dp[i], Integer.MAX_VALUE);
//        }
//
//        for (int i = 0; i < k; ++i) {
//            dp[0][i] = costs[0][i];
//        }
//
//        for (int i = 1; i < n; ++i) {
//            // min1 表示的是最大值，min2 表示的是次大值
//            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
//            int minIndex = -1;
//            for (int l = 0; l < k; ++l) {
//                if (min1 > dp[i - 1][l]) {
//                    min2 = min1;
//                    min1 = dp[i - 1][l];
//                    minIndex = l;
//                } else if (min2 > dp[i - 1][l]) {
//                    min2 = dp[i - 1][l];
//                }
//            }
//
//            for (int j = 0; j < k; ++j) {
//                if (minIndex != j) {
//                    dp[i][j] = Math.min(dp[i][j], min1 + costs[i][j]);
//                } else {
//                    dp[i][j] = Math.min(dp[i][j], min2 + costs[i][j]);
//                }
//            }
//        }
//
//        int result = Integer.MAX_VALUE;
//        for (int i = 0; i < k; ++i) {
//            result = Math.min(result, dp[n - 1][i]);
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        int[][] nums = {{1, 5, 3}, {2, 2, 4}, {7, 3, 9}};
        int i = minCostII(nums);
        System.out.println(i);
    }

}
