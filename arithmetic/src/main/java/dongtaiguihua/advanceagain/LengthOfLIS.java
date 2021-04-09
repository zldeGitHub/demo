package dongtaiguihua.advanceagain;

import java.util.Arrays;

/**
 * 300. 最长递增子序列
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * <p>
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3, 6, 2, 7] 是数组 [0, 3, 1, 6, 2, 2, 7] 的子序列。
 * <p>
 * 输入：nums = [10, 9, 2, 5, 3, 7, 101, 18]
 * 输出：4
 * 解释：最长递增子序列是 [2, 3, 7, 101]，因此长度为 4 。
 * <p>
 * 输入：nums = [0, 1, 0, 3, 2, 3]
 * 输出：4
 * <p>
 * 输入：nums = [7, 7, 7, 7, 7, 7, 7]
 * 输出：1
 * https://leetcode-cn.com/problems/longest-increasing-subsequence/
 *
 * @author Levy Zhao
 * @since 2021-04-09 09:33
 **/
public class LengthOfLIS {

    // 写了个寂寞，循环内写的太拉胯
//    public static int lengthOfLIS(int[] nums) {
//        int len = nums.length;
//        int[] dp = new int[len];
//        Arrays.fill(dp, 1);
//        for (int i = 1; i < len; i++) {
//            int[] ints = new int[i];
//            Arrays.fill(ints, 1);
//            for (int j = i - 1; j >= 0; j--) {
//                if (nums[i] > nums[j]) {
//                    ints[j] = dp[j] + 1;
//                }
//            }
//            Arrays.sort(ints);
//            dp[i] = ints[ints.length - 1];
//        }
//        Arrays.sort(dp);
//        return dp[len - 1];
//    }

    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];

        int max = 0;
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) {
//        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums = {0, 1, 0, 3, 2, 3};
        System.out.println(lengthOfLIS(nums));
    }

}
