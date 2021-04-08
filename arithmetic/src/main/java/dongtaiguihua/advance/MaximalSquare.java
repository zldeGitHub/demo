package dongtaiguihua.advance;

/**
 * 221. 最大正方形
 * 在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。
 *
 * https://leetcode-cn.com/problems/maximal-square/
 *
 * @author Levy Zhao
 * @since 2021-04-08 17:42
 **/
public class MaximalSquare {

    /**
     * 输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
     * 输出：4
     *
     * 输入：matrix = [["0","1"],["1","0"]]
     * 输出：1
     *
     * 输入：matrix = [["0"]]
     * 输出：0
     */

    public static int maximalSquare(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if (n == 0) {
            return 0;
        }

        int[][] dp = new int[m][n];
        int maxLen = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = matrix[i][j] == 1 ? 1 : 0;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    }
                    maxLen = Math.max(dp[i][j], maxLen);
                }
            }
        }

        return maxLen * maxLen;

    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1, 0, 0}, {1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 0, 1, 0}};

        int i = maximalSquare(matrix);
        System.out.println(i);

    }


}
