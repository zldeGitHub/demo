package dongtaiguihua.advanceagain;

import java.util.Arrays;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Levy Zhao
 * @since 2021-04-12 15:45
 **/
public class Rob {

    /**
     * 示例 1：
     * <p>
     * 输入：[1,2,3,1]
     * 输出：4
     * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     *      偷窃到的最高金额 = 1 + 3 = 4 。
     * 示例 2：
     * <p>
     * 输入：[2,7,9,3,1]
     * 输出：12
     * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
     */

    // 思考不全面，只考虑隔开一个房间偷，房间里的钱才是决定怎么个偷法。
//    public static int rob(int[] nums) {
//        // dp[i] = dp[i - 2] + nums[i];
//        int len = nums.length;
//        if (len == 0) {
//            return 0;
//        }
//        if (len <= 2) {
//            Arrays.sort(nums);
//            return nums[len - 1];
//        }
//        int[] dp = new int[len];
//        dp[0] = nums[0];
//        dp[1] = nums[1];
//
//        for (int i = 2; i < len; i++) {
//            dp[i] = dp[i - 2] + nums[i];
//        }
//        return Math.max(dp[len - 1], dp[len - 2]);
//    }

    // 成功咯，继续加油
    public static int rob(int[] nums) {
        // dp[i] = dp[i - 2] + nums[i];
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len <= 2) {
            Arrays.sort(nums);
            return nums[len - 1];
        }

        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < len; i++) {
            int max1 = 0;
            for (int j = 0; j < i - 1; j++) {
                max1 = Math.max(dp[j] + nums[i], max1);
            }
            dp[i] = max1;
        }
        return Math.max(dp[len - 1], dp[len - 2]);
    }

    public int rob1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;

        int[] dp = new int[n + 1];

        dp[1] = nums[0];

        for (int i = 2; i <= n; ++i) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }

        return dp[n];
    }
    public static void main(String[] args) {
//        int[] nums = {2, 7, 9, 3, 1};   //12
//        int[] nums = {2, 7, 9, 3, 1, 2, 3};
//        int[] nums = {1,2,3,1};   //4
        int[] nums = {2, 1, 1, 2};   //4
        int rob = rob(nums);
        System.out.println(rob);
    }

}
