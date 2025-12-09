package treetraversal;

import java.util.ArrayList;
import java.util.Scanner;
import codinginterviews.TreeNode;

public class TreeTraversal {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String numStr = in.nextLine();
        String []numStrArr = numStr.split(" ");
        int len = numStrArr.length;
        ArrayList<Integer> numArr = new ArrayList<Integer>();
        for(int i = 0;i<len;++i){
            numArr.add(Integer.parseInt(numStrArr[i]));
        }
        TreeNode root = buildTree(numArr);

        ArrayList<Integer> preArr = preorderTraversal(root);
        for(int i =0;i<preArr.size();++i){
            System.out.print(preArr.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer> inArr = inorderTraversal(root);
        for(int i =0;i<inArr.size();++i){
            System.out.print(inArr.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer> postArr = postorderTraversal(root);
        for(int i =0;i<postArr.size();++i){
            System.out.print(postArr.get(i)+" ");
        }
    }
    public static TreeNode buildTree(ArrayList<Integer> Arr){
        int len = Arr.size();
        if(len<=0)
            return null;
        if(len<=2)
            return new TreeNode(Arr.get(0));
        ArrayList<TreeNode> treeNode = new ArrayList<TreeNode>();
        for(int i =0;i<len;++i){
            treeNode.add(new TreeNode(Arr.get(i)));
        }
        int sonIndex =1;
        int parentIndex=0;
        while (sonIndex<len){
            treeNode.get(parentIndex).left = treeNode.get(sonIndex++);
            treeNode.get(parentIndex++).right = treeNode.get(sonIndex++);
        }
        return treeNode.get(0);
    }

    public static ArrayList<Integer> preorderTraversal(TreeNode root){
        if(root==null)
            return  new ArrayList<Integer>();
        ArrayList<Integer> preorderArr = new ArrayList<Integer>();
        preorderArr.add(root.val);
        preorderArr.addAll(preorderTraversal(root.left));
        preorderArr.addAll(preorderTraversal(root.right));
        return preorderArr;
    }

    public static ArrayList<Integer> inorderTraversal(TreeNode root){
        if(root==null)
            return  new ArrayList<Integer>();
        ArrayList<Integer> inorderArr = new ArrayList<Integer>();
        inorderArr.addAll(inorderTraversal(root.left));
        inorderArr.add(root.val);
        inorderArr.addAll(inorderTraversal(root.right));
        return inorderArr;
    }

    public static ArrayList<Integer> postorderTraversal(TreeNode root){
        if(root==null)
            return  new ArrayList<Integer>();
        ArrayList<Integer> postorderArr = new ArrayList<Integer>();
        postorderArr.addAll(postorderTraversal(root.left));
        postorderArr.addAll(postorderTraversal(root.right));
        postorderArr.add(root.val);
        return postorderArr;
    }

}
