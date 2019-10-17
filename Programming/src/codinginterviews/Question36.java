package codinginterviews;

public class Question36 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return pRootOfTree;
        TreeNode temp=pRootOfTree;
        if(pRootOfTree.left!=null){
            temp = Convert(pRootOfTree.left);
            while (temp.right!=null)
                temp = temp.right;
            temp.right = pRootOfTree;
            pRootOfTree.left = temp;
        }
        if(pRootOfTree.right!=null){
            temp = Convert(pRootOfTree.right);
            temp.left = pRootOfTree;
            pRootOfTree.right = temp;
        }
        while (temp!=null&&temp.left!=null)
            temp = temp.left;
        return temp;
    }
}
