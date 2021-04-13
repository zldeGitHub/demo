package dongtaiguihua.advanceagain;

import java.util.Arrays;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Levy Zhao
 * @since 2021-04-13 09:18
 **/
public class RobII {

    /**
     * 示例 1：
     * 输入：nums = [2,3,2]
     * 输出：3
     * 解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
     * <p>
     * 示例 2：
     * 输入：nums = [1,2,3,1]
     * 输出：4
     * 解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
     *      偷窃到的最高金额 = 1 + 3 = 4 。
     * <p>
     * 示例 3：
     * 输入：nums = [0]
     * 输出：0
     */

    public static int rob(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }


        return Math.max(rob1(Arrays.copyOfRange(nums, 0, n - 1)), rob1(Arrays.copyOfRange(nums, 1, n)));
    }

    public static int rob1(int[] nums) {
        int length = nums.length;
        if (nums == null || length == 0) {
            return 0;
        }
        int[] dp = new int[length + 1];
        dp[1] = nums[0];

        for (int i = 2; i <= length; i++) {
            // nums的 i-1 ： ∵ dp 和 nums 角標差一
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[length];
    }


    public static void main(String[] args) {
//        int[] nums = {2, 3, 2};
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
