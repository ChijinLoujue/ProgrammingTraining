package codinginterviews;

import java.util.Stack;

public class Question9 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() throws Exception {
        if(stack1.size()==0)
            throw new Exception("erro");
        while (stack1.size()>0){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        int result = stack2.peek();
        stack2.pop();
        while (stack2.size()>0){
            stack1.push(stack2.peek());
            stack2.pop();
        }
        return result;
    }



}
