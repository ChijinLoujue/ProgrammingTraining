package codinginterviews;

import java.rmi.server.ExportException;
import java.util.Scanner;
import java.util.Stack;

public class Question30 {
    public static void main(String []args){

    }
    public class StackwithMin {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stackMin = new Stack<Integer>();
        public void push(int node) {
            stack1.push(node);
            if(stackMin.isEmpty()||(node<stackMin.peek()))
                stackMin.push(node);
            else {
                stackMin.push(stackMin.peek());
            }
        }

        public void pop() {
                if(stack1.isEmpty())
                    throw new UnsupportedOperationException();
                stack1.pop();
                stackMin.pop();
        }

        public int top() {
            return stack1.peek();
        }

        public int min() {
            return stackMin.peek();
        }
    }
}
