package q131;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 列出所有回文子串
 *
 * @author Levy Zhao
 * @since 2021-03-08 17:03
 **/
public class Solution {

    static boolean[][] f;
    static List<List<String>> ret = new ArrayList<List<String>>();
    static List<String> ans = new ArrayList<String>();
    static int n;

    public static void main(String[] args) {
        partition("aab");
    }

    public static List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(f[i], true);
        }

        for (int i = 2; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
            }
        }

        dfs(s, 0);
        System.out.println(ret);
        return ret;
    }

    public static void dfs(String s, int i) {
        if (i == n) {
            ret.add(new ArrayList<String>(ans));
            return;
        }
        for (int j = i; j < n; ++j) {
            if (f[i][j]) {
                ans.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }

}
