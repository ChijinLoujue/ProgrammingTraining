public class LeetCode9 {

    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        if (xStr.length() <= 1) {
            return true;
        }
        for (int i = 0; i < xStr.length(); i++) {
            int j = xStr.length() - 1 - i;
            if (i >= j) {
                break;
            }
            if (xStr.charAt(i) != xStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
