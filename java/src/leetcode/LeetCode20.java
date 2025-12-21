import java.util.Stack;

public class LeetCode20 {

    public static void main(String[] args) {
        LeetCode20 solution = new LeetCode20();
        String s = "";
        System.out.println(solution.isValid(s));
    }

    public boolean isValid(String s) {
        if (s.equals("")) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((s.charAt(i) == ')' && stack.peek() == '(')
                        || (s.charAt(i) == ']' && stack.peek() == '[')
                        || (s.charAt(i) == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
