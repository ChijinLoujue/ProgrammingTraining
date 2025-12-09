//
// Created by ChijinLoujue on 2021/2/5.
//

#include <cstdlib>

struct TreeNode {
     int val;
     TreeNode *left;
     TreeNode *right;
     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    TreeNode* mirrorTree(TreeNode* root) {
        if(root == nullptr){
            return root;
        }
        if(root->left== nullptr && root->right == nullptr){
            return root;
        }
        TreeNode* treenode = root->left;
        root->left = root->right;
        root->right = treenode;
        mirrorTree(root->left);
        mirrorTree(root->right);
        return root;
    }
};