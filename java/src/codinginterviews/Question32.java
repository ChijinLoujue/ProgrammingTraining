package codinginterviews;

import java.util.ArrayList;
import java.util.Iterator;

public class Question32 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        ArrayList<Integer> resultArray=new ArrayList<>(root.val);
        ArrayList<TreeNode> nodeArray=new ArrayList<>();
        nodeArray.add(root);
        int index = 0;
        while (index<nodeArray.size()){
            resultArray.add(nodeArray.get(index).val);
            if(nodeArray.get(index).left!=null)
                nodeArray.add(nodeArray.get(index).left);
            if(nodeArray.get(index).right!=null)
                nodeArray.add(nodeArray.get(index).right);
            index++;
        }
        return resultArray;
    }
}
