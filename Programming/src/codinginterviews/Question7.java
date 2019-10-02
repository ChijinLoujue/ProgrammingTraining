package codinginterviews;

import java.util.Scanner;

public class Question7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String preLine = sc.nextLine();
        String inLine = sc.nextLine();
        String []preStr = preLine.split(" ");
        String []inStr = inLine.split(" ");
        int preLen = preStr.length;
        int inLen = inStr.length;
        int []pre = new int[preLen];
        int []in = new int[inLen];
        for(int i = 0;i<preLen;++i){
            pre[i] = Integer.parseInt(preStr[i]);
        }
        for(int i = 0;i<inLen;++i){
            in[i] = Integer.parseInt(inStr[i]);
        }
        TreeNode result = reConstructBinaryTree(pre,in);
        System.out.println(result.toString());
    }

    public static TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length!=in.length)
        return null;
        if(pre.length==1)
            return new TreeNode(pre[0]);
        if(pre.length<1)
            return null;
        int len = pre.length;
        int rootValue = pre[0];
        TreeNode rootNode = new TreeNode(rootValue);
        int rootIndex =0;
        while (rootValue!=in[rootIndex]&&rootIndex<len)
            ++rootIndex;
        int []leftIn = copyArray(in,0,rootIndex-1);
        int []rightIn = copyArray(in,rootIndex+1,len-1);
        int leftLen = leftIn.length;
        int rightLen = rightIn.length;
        int []leftPre = copyArray(pre,1,leftLen);
        int []rightPre = copyArray(pre,leftLen+1,leftLen+rightLen);
        rootNode.left = reConstructBinaryTree(leftPre,leftIn);
        rootNode.right = reConstructBinaryTree(rightPre,rightIn);
        return rootNode;
    }

    public static int[] copyArray(int [] array,int start,int end){
        int len = end-start+1;
        int [] result = new int[len];
        for(int i=0;i<len;++i){
            result[i]=array[start+i];
        }
        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
