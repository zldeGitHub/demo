package dongtaiguihua;

/**
 * 爬楼梯：
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 *
 * @author Levy Zhao
 * @since 2021-04-07 17:37
 **/
public class ClimbStairs {

//    爬楼梯，可以爬一步也可以爬两步，问有多少种不同的方式到达终点，我们按照上面提到的四个步骤进行分析：
//
//    问题拆解：
//      我们到达第 n 个楼梯可以从第 n - 1 个楼梯和第 n - 2 个楼梯到达，因此第 n 个问题可以拆解成第 n - 1 个问题和第 n - 2 个问题，
//      第 n - 1 个问题和第 n - 2 个问题又可以继续往下拆，直到第 0 个问题，也就是第 0 个楼梯 (起点)
//
//    状态定义
//      “问题拆解” 中已经提到了，第 n 个楼梯会和第 n - 1 和第 n - 2 个楼梯有关联，那么具体的联系是什么呢？你可以这样思考，
//      第 n - 1 个问题里面的答案其实是从起点到达第 n - 1 个楼梯的路径总数，n - 2 同理，从第 n - 1 个楼梯可以到达第 n 个楼梯，从第 n - 2 也可以，
//      并且路径没有重复，因此我们可以把第 i 个状态定义为 “从起点到达第 i 个楼梯的路径总数”，状态之间的联系其实是相加的关系。
//
//    递推方程
//      “状态定义” 中我们已经定义好了状态，也知道第 i 个状态可以由第 i - 1 个状态和第 i - 2 个状态通过相加得到，
//      因此递推方程就出来了 dp[i] = dp[i - 1] + dp[i - 2]
//
//    实现
//    你其实可以从递推方程看到，我们需要有一个初始值来方便我们计算，起始位置不需要移动 dp[0] = 0，第 1 层楼梯只能从起始位置到达，因此 dp[1] = 1，
//    第 2 层楼梯可以从起始位置和第 1 层楼梯到达，因此 dp[2] = 2，有了这些初始值，后面就可以通过这几个初始值进行递推得到。

    static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

}
