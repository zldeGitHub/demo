package tanxinsuanfa;

/**
 * 貪心算法
 * 小明手中有 1，5，10，50，100 五种面额的纸币，每种纸币对应张数分别为 5，2，2，3，5 张。若小明需要支付 456 元，则需要多少张纸币？
 *
 * @author Levy Zhao
 * @since 2021-04-07 17:03
 **/
public class AreedyAlgorithm {

//    制定的贪心策略为：在允许的条件下选择面额最大的纸币。则整个求解过程如下：
//    选取面值为 100 的纸币，则 X1 = 100, V = 456 - 100 = 356；
//    继续选取面值为 100 的纸币，则 X2 = 100, V = 356 - 100 = 256；
//    继续选取面值为 100 的纸币，则 X3 = 100, V = 256 - 100 = 156；
//    继续选取面值为 100 的纸币，则 X4 = 100, V = 156 - 100 = 56；
//    选取面值为 50 的纸币，则 X5 = 50, V = 56 - 50 = 6；
//    选取面值为 5 的纸币，则 X6 = 5, V = 6 - 5 = 1；
//    选取面值为 1 的纸币，则 X7 = 1, V = 1 - 1 = 0；求解结束

    static int N = 5;
    static int count[] = {5,2,2,3,5};//每一张纸币的数量
    static int value[] = {1, 5, 10, 50, 100};

    static int solve(int money) {
        int num = 0;
        for (int i = N - 1; i >= 0; i--) {
            int c = Math.min(money / value[i], count[i]);//每一个所需要的张数
            money = money - c * value[i];
            num += c;//总张数
        }
        if (money > 0) num = -1;
        return num;
    }

    public static void main(String[] args) {
        int solve = solve(456);
        System.out.println(solve);
    }


}
