package dongtaiguihua;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到    **下一行中相邻的结点上**。
 * 例如，给定三角形：
 *
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 *
 * 说明：
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 *
 * @author Levy Zhao
 * @since 2021-04-08 09:06
 **/
public class MinimumTotal {

    static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        List<Integer> lastRow = triangle.get(n - 1);

        // 填充最后一行数据
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = lastRow.get(i);
        }

        for (int i = n - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < i + 1; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + row.get(j);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);

        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);

        int i = minimumTotal(lists);
        System.out.println(i);
    }

}
