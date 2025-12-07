
//LeetCode5: 最大回文字符串
import java.util.Scanner;

public class LeetCode5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new LeetCode5().longestPalindrome(s));
        sc.close();
    }

    public  String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        Integer maxLength = 0;
        int left = 0;
        int right = 0;
        int[][] lengthMatrix = new int[s.length()][s.length()];
        for (int n = 0; n < s.length(); n++) {
            for (int i = 0; i + n < s.length(); i++) {
                int currentLength = huiwenlong(s, i, i + n, lengthMatrix);
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    left = i;
                    right = i + n + 1;
                }
            }
        }
        return s.substring(left, right);
    }

    private int huiwenlong(String s, int i, int j, int[][] x) {
        if (i == j) {
            x[i][j] = 1;
            return x[i][j];
        }
        if (x[i + 1][j - 1] == -1 || s.charAt(i) != s.charAt(j)) {
            x[i][j] = -1;
        } else {
            x[i][j] = x[i + 1][j - 1] + 2;
        }
        return x[i][j];
    }

}