public class LeetCode8 {


    public int myAtoi(String s) {
        StringBuffer result = new StringBuffer();
        boolean isBegain = false;
        boolean isFu = false;
        boolean uselessZero = true;
        for (int i = 0; i < s.length(); i++) {
            if (!isBegain) {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (s.charAt(i) == '+') {
                    isBegain = true;
                    continue;
                }
                if (s.charAt(i) == '-') {
                    isBegain = true;
                    isFu = true;
                    continue;
                }
            }
            if (s.charAt(i) == '0' && uselessZero) {
                isBegain = true;
                continue;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                uselessZero = false;
                result.append(s.charAt(i));
                isBegain = true;
                continue;
            } else {
                break;
            }
        }
        Long result3;
        try {
            if (result.length() > 10) {
                result3 = Long.parseLong("2147483648");
            } else {
                result3 = Long.parseLong(result.toString());
            }
        } catch (Exception e) {
            return 0; 
        }
        Long result2;
        if (isFu) {
            result2 = 0 - result3;
        } else {
            result2 = result3;
        }
        if (result2 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (result2 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return result2.intValue();
    }
}
