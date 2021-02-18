//
// Created by ChijinLoujue on 2021/2/4.
//



#include <cstdlib>
#include <mshtmlc.h>

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    bool isSubStructure(TreeNode* A, TreeNode* B) {
        bool result = false;
        if(A!= nullptr &&B!=nullptr){
            if(A->val == B->val){
                result = doesTree1hasTree2(A,B);
            }
            if(!result){
                result = isSubStructure(A->left,B);
            }
            if(!result){
                result = isSubStructure(A->right,B);
            }
        }
        return result;
    }
    bool doesTree1hasTree2(TreeNode* A,TreeNode* B){
        if(B == nullptr){
            return true;
        }
        if(A == nullptr){
            return false;
        }
        if(A->val != B->val){
            return false;
        }
        return doesTree1hasTree2(A->left,B->left)&&doesTree1hasTree2(A->right,B->right);
    }
};