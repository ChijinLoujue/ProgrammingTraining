package codinginterviews;

import java.util.ArrayList;

public class Question36 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return pRootOfTree;
        pRootOfTree.left = Convert(pRootOfTree.left);

        pRootOfTree.right = Convert(pRootOfTree.right);
    }

    public ArrayList<Integer> bianli(TreeNode pRootOfTree) {
        ArrayList<Integer> result = new ArrayList<Integer>();
            if(pRootOfTree==null)
                return result;
            result.addAll(bianli((pRootOfTree.right)));
            result.add(pRootOfTree.val);
            result.addAll(bianli(pRootOfTree.right));
        return result;
    }

}
