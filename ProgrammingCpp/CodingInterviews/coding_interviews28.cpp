//
// Created by ChijinLoujue on 2021/2/5.
//

 struct TreeNode {
     int val;
     TreeNode *left;
     TreeNode *right;
     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 };

class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        return isSymmetric(root,root);
    }
    bool isSymmetric(TreeNode* root,TreeNode* root2) {
        bool result = false;
        if(root == nullptr && root2 == nullptr){
            return true;
        }
        if(root == nullptr ||root2 == nullptr){
            return false;
        }
        if(root->val != root2->val){
            return false;
        }
        return isSymmetric(root->left,root2->right)&&isSymmetric(root->right,root2->left);
    }

};