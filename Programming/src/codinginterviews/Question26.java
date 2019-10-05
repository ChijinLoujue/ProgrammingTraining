package codinginterviews;

import java.util.Scanner;

public class Question26 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String []str1 = input1.split(" ");
        String []str2 = input2.split(" ");
        TreeNode root1 = null;
        TreeNode root2 = null;
        System.out.println(HasSubtree(root1,root2));
    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val&&HasSubAlltree(root1,root2)){
                return true;
            }else {
                return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
            }
        }
        return false;
    }

    public static boolean HasSubAlltree(TreeNode root1, TreeNode root2){
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return HasSubAlltree(root1.left,root2.left)&&HasSubAlltree(root1.right,root2.right);


    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
