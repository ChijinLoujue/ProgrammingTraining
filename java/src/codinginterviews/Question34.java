package codinginterviews;

import java.util.ArrayList;

public class Question34 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null)
            return new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        int currentSum = 0;
        return FindPath(root,currentPath,currentSum,target);
    }



    public ArrayList<ArrayList<Integer>> FindPath(
            TreeNode root,
            ArrayList<Integer>currentPath,
            int currentSum,int x) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        currentSum +=root.val;
        currentPath.add(root.val);
        if(root.right==null&&root.left==null){
            if(currentSum==x){
                result.add(new ArrayList<Integer>(currentPath));
            }
        }else {
            if(root.left!=null){
                result.addAll(FindPath(root.left,currentPath,currentSum,x));
            }
            if(root.right!=null){
                result.addAll(FindPath(root.right,currentPath,currentSum,x));
            }
        }
        currentPath.remove(currentPath.size()-1);
        return result;
    }
}


