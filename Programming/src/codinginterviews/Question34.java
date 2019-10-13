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
            TreeNode thisNode,
            ArrayList<Integer>currentPath,
            int currentSum,int target) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        currentSum +=thisNode.val;
        currentPath.add(thisNode.val);
        if(thisNode.right==null&&thisNode.left==null){
            if(currentSum==target){
                result.add(new ArrayList<Integer>(currentPath));
            }
        }else {
            if(thisNode.left!=null){
                result.addAll(FindPath(thisNode.left,currentPath,currentSum,target));
            }
            if(thisNode.right!=null){
                result.addAll(FindPath(thisNode.right,currentPath,currentSum,target));
            }
        }
        currentPath.remove(currentPath.size()-1);
        return result;
    }
}
