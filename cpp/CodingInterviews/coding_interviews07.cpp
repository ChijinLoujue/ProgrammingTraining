//
// Created by ChijinLoujue on 2021/1/20.
//

#include <iostream>
#include <vector>
#include <string>
#include<algorithm>
using namespace std;

struct TreeNode {
     int val;
     TreeNode *left;
     TreeNode *right;
     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        if(preorder.size() != inorder.size() || preorder.size()==0){
            return NULL;
        }
        return buildTree1(preorder.begin(),preorder.end(),inorder.begin(),inorder.end());

    }
    TreeNode* buildTree1(
            vector<int>::iterator pre_start, vector<int>::iterator pre_end,
            vector<int>::iterator ind_start, vector<int>::iterator ind_end)
    {
        int rootValue = pre_start[0];
        TreeNode* root = new TreeNode(rootValue);
        if(pre_start == pre_end){
            return root;
        }
        vector<int>::iterator ind_root = ind_start;
        vector<int>::iterator left_pre_end = pre_start;
        while(ind_root != ind_end && ind_root[0]!=rootValue){
            ind_root++;
            left_pre_end++;
        }
        left_pre_end++;
        root->left = buildTree1(pre_start+1,left_pre_end,ind_start,ind_root);
        root->right = buildTree1(left_pre_end,pre_end,ind_root+1,ind_end);
        return root;
    }


//    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
//        if(preorder.size() != inorder.size() || preorder.size()==0){
//            return NULL;
//        }
//
//        // 使用迭代器 iterator 访问值
//        vector<int>::iterator inorder_index = inorder.begin();
//        vector<int>::iterator preorder_index = preorder.begin()+1;
//        vector<int> left_sub_preorder;
//        vector<int> right_sub_preorder;
//        vector<int> left_sub_inorder;
//        vector<int> right_sub_inorder;
//        int left_sub_length = 0;
//        TreeNode* root = new TreeNode(0);
//        bool left_sub = true;
//        while( inorder_index != inorder.end()) {
//            if(inorder_index[0] == preorder[0]){
//                root->val = inorder_index[0];
//                left_sub = false;
//                inorder_index++;
//            }
//            if(preorder_index!=preorder.end()){
//                if(left_sub){
//                    left_sub_preorder.push_back(preorder_index[0]);
//                    left_sub_inorder.push_back(inorder_index[0]);
//                } else{
//                    right_sub_preorder.push_back(preorder_index[0]);
//                    right_sub_inorder.push_back(inorder_index[0]);
//                }
//                preorder_index++;
//            }
//            inorder_index++;
//        }
//        root->left = buildTree(left_sub_preorder,left_sub_inorder);
//        root->right = buildTree(right_sub_preorder,right_sub_inorder);
//        left_sub_preorder.clear();
//        left_sub_inorder.clear();
//        right_sub_preorder.clear();
//        right_sub_inorder.clear();
//        return root;
//
//    }
};