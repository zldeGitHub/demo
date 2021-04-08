package q80;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 输入：nums = [1,1,1,2,2,3]
 输出：5, nums = [1,1,2,2,3]
 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 不需要考虑数组中超出新长度后面的元素。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 *
 * @author Levy Zhao
 * @since 2021-04-06 13:49
 **/
public class Solution {

    // 双指针法
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int slow = 2, fast = 2;
        while (fast < len) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2,2, 3};
        int s = removeDuplicates(nums);
        System.out.println(s);
    }
}
