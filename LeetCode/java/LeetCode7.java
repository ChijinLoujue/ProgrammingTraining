import java.util.Scanner;

/**
 * 7. Reverse Integer
 * 
 * 
 * 
 * 
 */

public class LeetCode7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(Integer.valueOf(s)));
        sc.close();
    }
    
    public static int reverse(int x) {
        if (x > -10 && x < 10) {
            return x;
        }
        boolean isRight = true;
        if (x < 0) {
            x = 0 - x;
            isRight = false;
        }
        String xStr = String.valueOf(x);
        StringBuffer stringBuffer = new StringBuffer();
        boolean isZone = true;
        for (int i = xStr.length() - 1; i >= 0; i--) {
            if (xStr.charAt(i) == '0' && isZone) {
                continue;
            }
            isZone = false;
            stringBuffer.append(xStr.charAt(i));
        }
        String s = stringBuffer.toString();
        if (s == "2147483648" && !isRight) {
            return -2147483648;
        }
        int y;
        try {
            y = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
        if (isRight) {
            return y;
        } else {
            return 0 - y;
        }
    }
}
