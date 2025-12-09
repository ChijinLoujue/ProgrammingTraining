package codinginterviews;

import java.util.Scanner;
import java.util.Stack;

public class Question31 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String []str1 = input1.split(" ");
        String []str2 = input2.split(" ");
        int len1 = str1.length;
        int len2 = str2.length;
        int []pushArray = new int[len1];
        int []popArray = new int[len2];
        for(int i = 0;i<len1;++i){
            pushArray[i]=Integer.parseInt(str1[i]);
        }
        for(int i = 0;i<len2;++i){
            popArray[i]=Integer.parseInt(str2[i]);
        }
        System.out.println(IsPopOrder(pushArray,popArray));
    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(popA==null||pushA==null)
            return false;
        int len = pushA.length;
        Stack<Integer> stack = new Stack<Integer>();
        int i=0;
        int j=1;
        stack.push(pushA[0]);
        for(;i<len;++i){
            for (;j<=len;++j){
                if(stack.peek()==popA[i]){
                    stack.pop();
                    break;
                }
                if(j==len)
                    return false;
                stack.push(pushA[j]);
            }
        }
        if(i>=len)
            return true;
        return false;
    }
}
/*
1 2 3 4 5
4 3 5 1 2

1 2 3 4 5
4 5 3 2 1
 */
