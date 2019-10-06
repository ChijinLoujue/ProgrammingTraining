package codinginterviews;

import java.util.Scanner;

public class Question27 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String []str = input.split(" ");
        TreeNode root = null;
        Mirror(root);
    }
    public static void Mirror(TreeNode root) {
        if(root!=null){
            if(root.left!=null)
                Mirror(root.left);
            if(root.right!=null)
                Mirror(root.right);
            if(root.right!=null||root.left!=null){
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
            }
        }
    }

}
