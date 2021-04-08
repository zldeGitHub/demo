package dongtaiguihua;

import java.util.Arrays;

/**
 * LeetCode 第 53 号问题：最大子序和。
 * 题目描述
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * @author Levy Zhao
 * @since 2021-04-08 10:10
 **/
public class MaxSubArray {
    /**
     * 自己的尝试解答，考虑不全面。只想到 0 - i 累加。
     */
//    static int maxSubArray(int[] nums) {
//        int len = nums.length;
//        if (len == 0) {
//            return 0;
//        }
//
//        int[] dp = new int[len + 1];
//        dp[0] = nums[0];
//        int max = dp[0];
//        for (int i = 1; i < len; i++) {
//            dp[i] += dp[i - 1];
//            max = Math.max(max, dp[i]);
//        }
//        return max;
//    }

    static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        int[] dp = new int[len + 1];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + nums[i];
            res = Math.max(res, dp[i]);
        }

        return res;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

}
