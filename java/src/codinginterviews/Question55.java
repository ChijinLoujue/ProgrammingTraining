package codinginterviews;

public class Question55 {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
    //question2
    public boolean IsBalanced_Solution(TreeNode root) {
        int []deepth = new int[1];
        deepth[0] = 0;
        return IsBalanced_Solution(root, deepth);
    }
    public boolean IsBalanced_Solution(TreeNode root,int[] deepth) {
        if(root==null){
            deepth[0] =0;
            return true;
        }
        int []leftDepth = {0};
        int []rightDepth = {0};
        if(IsBalanced_Solution(root.left,leftDepth)&&IsBalanced_Solution(root.right,rightDepth)){
            int diff = leftDepth[0]-rightDepth[0];
            if(diff<=1&&diff>=-1){
                deepth[0] = Math.max(leftDepth[0],rightDepth[0])+1;
                return true;
            }
        }
        return false;
    }
}
