package q179;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 *
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 *  
 *
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Levy Zhao
 * @since 2021-04-07 08:57
 **/
public class Solution {

    public static String largestNumber(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return "";
        }
        if (len < 2) {
            return String.valueOf(nums[0]);
        }
        for (int i = 0; i < len; i++) {

        }
        return "";
    }

    public static void main(String[] args) {

    }
}
