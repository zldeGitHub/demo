package fenzhisuanfa;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 二分查找法
 *
 * @author Levy Zhao
 * @since 2021-04-13 10:54
 **/
public class BinarySearch {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 24HH:mm:ss");
    /**
     * 二分查找：二分查找是典型的分治算法的应用。需要注意的是，二分查找的前提是查找的数列是有序的。
     * <p>
     * 算法流程：
     *   （1）选择一个标志 i 将集合分为二个子集合。
     *   （2）判断标志 L(i) 是否能与要查找的值 des 相等，相等则直接返回。
     *   （3）否则判断 L(i) 与 des 的大小。
     *   （4）基于判断的结果决定下步是向左查找还是向右查找。
     *   （5）递归继续上面的步骤。
     * <p>
     *   通过二分查找的流程可以看出，二分查找是将原有序数列划分为左右两个子序列，然后在对两个子序列中的其中一个在进行划分，直至查找成功。
     */

    private static  <E extends Comparable> E binarySearch(E[] nums, E e) {
        int n = nums.length;
        if (nums == null || n == 0) {
            return null;
        }

        return binarySearch(nums, e, 0, n - 1);
    }

    private static <E extends Comparable> E binarySearch(E[] nums, E e, int l, int r) {

        int mid = l + (r - l) / 2;

        if (l > r) {
            return null;
        }
        if (nums[mid].compareTo(e) == 0) {
            return nums[mid];
        }

        if (nums[mid].compareTo(e) > 0) {
            return binarySearch(nums, e, l, mid - 1);
        } else {
            return binarySearch(nums, e, mid + 1, r);
        }
    }


    /**
     * 全排列问题
     *
     * 问题描述：
     *   有1，2，3，4个数，问你有多少种排列方法，并输出排列。
     * 问题分析：
     *   若采用分治思想进行求解，首先需要把大问题分解成很多的子问题，大问题是所有的排列方法。那么我们分解得到的小问题就是以 1 开头的排列，
     * 以 2 开头的排列，以 3 开头的排列，以 4 开头的排列。现在这些问题有能继续分解，比如以 1 开头的排列中，只确定了 1 的位置，
     * 没有确定 2 ，3 ，4 的位置，把 2，3，4 三个又看成大问题继续分解，2 做第二个，3 做第二个，或者 4 做第二个。
     * 一直分解下去，直到分解成的子问题只有一个数字的时候，不能再分解。只有一个数的序列只有一种排列方式，则子问题求解容易的多。
     */

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4};
        fullSort(arr, 0, arr.length - 1);
    }

    public static void fullSort(int[] arr, int start, int end) {
        // 递归终止条件
        if (start == end) {
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(arr, i, start);
            fullSort(arr, start + 1, end);
            swap(arr, i, start);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
