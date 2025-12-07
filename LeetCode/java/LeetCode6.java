import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LeetCode6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int numRows = scanner.nextInt();
        System.out.println(convert(s, numRows));
        scanner.close();
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuffer> stringBufferList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            stringBufferList.add(new StringBuffer());
        }
        int up = 1;
        int current = 0;
        for (int i = 0; i < s.length();) {
            stringBufferList.get(current).append(s.charAt(i));
            i++;
            if (current == 0) {
                up = 1;
            }
            if (current == numRows - 1) {
                up = -1;
            }
            current = current + up;
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            result.append(stringBufferList.get(i));
        }
        return result.toString();
    }
}