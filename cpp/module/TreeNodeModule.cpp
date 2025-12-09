//
// Created by ChijinLoujue on 2021/2/6.
//

#include "TreeNodeModule.h"

TreeNode* makeTreefromNums(vector<int> nums, int index, int nullmarke){

    if(nums.empty() ||nums[index] == nullmarke){
        return nullptr;
    }
    TreeNode* root;
    root->val = nums[index];
    root->left = makeTreefromNums(nums, ++index, nullmarke);
    root->right = makeTreefromNums(nums, ++index, nullmarke);
    return root;
}

TreeNode * TreeNodeModule::makeTreefromNums(vector<int> nums, int nullmarke) {
    int length = nums.size();
    if(length == 0){
        return nullptr;
    }
    queue<TreeNode*> que;
    TreeNode* root;
    que.push(root);
    for(int i = 0;i <length;++i){
        if(nums[i]==nullmarke){
            que.pop();
        }else{
            TreeNode* node = que.front();
            node->val = nums[i];
            que.pop();
            que.push(node->left);
            que.push(node->right);
        }
    }

}