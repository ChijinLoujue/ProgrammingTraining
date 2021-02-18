//
// Created by ChijinLoujue on 2021/2/6.
//


#include <iostream>
#include <cstdlib>
#include <vector>
#include <stack>
#include <queue>

using  namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    vector<int> levelOrder(TreeNode* root) {
        vector<int> result;
        queue<TreeNode*> que;
        if(root == nullptr){
            return result;
        }
        que.push(root);
        while (!que.empty()){
            TreeNode* temp = que.front();
            que.pop();
            result.push_back(temp->val);
            if(temp->left){
                que.push(temp->left);
            }
            if(temp->right){
                que.push(temp->right);
            }
        }
        return result;
    }

    vector<vector<int>> levelOrder2(TreeNode* root) {
        vector<vector<int>> result;
        queue<TreeNode*> que;
        int thisnum = 0;
        int nextnum = 0;
        if(root == nullptr){
            return result;
        }
        que.push(root);
        thisnum++;
        vector<int> thislayer;
        while (!que.empty()){
            TreeNode* temp = que.front();
            que.pop();
            thislayer.push_back(temp->val);
            thisnum--;
            if(temp->left){
                que.push(temp->left);
                nextnum++;
            }
            if(temp->right){
                que.push(temp->right);
                nextnum++;
            }
            if(thisnum==0){
                result.push_back(thislayer);
                thislayer.clear();
                thisnum = nextnum;
                nextnum = 0;
            }
        }
        return result;
    }


    vector<vector<int>> levelOrder3(TreeNode* root) {
        vector<vector<int>> result;
        stack<TreeNode*> stk1;
        stack<TreeNode*> stk2;
        int layer = 0;
        if(root == nullptr){
            return result;
        }
        stk1.push(root);
        vector<int> thislayer;
        while (!stk1.empty() || !stk2.empty()){
            if(layer%2==0){
                if(!stk1.empty()){
                    TreeNode* temp = stk1.top();
                    stk1.pop();
                    thislayer.push_back(temp->val);
                    if(temp->left){
                        stk2.push(temp->left);
                    }
                    if(temp->right){
                        stk2.push(temp->right);
                    }
                }else{
                    result.push_back(thislayer);
                    thislayer.clear();
                    layer++;
                }
            }else{
                if(!stk2.empty()){
                    TreeNode* temp = stk2.top();
                    stk2.pop();
                    thislayer.push_back(temp->val);
                    if(temp->right){
                        stk1.push(temp->right);
                    }
                    if(temp->left){
                        stk1.push(temp->left);
                    }
                }else{
                    result.push_back(thislayer);
                    thislayer.clear();
                    layer++;
                }
            }
        }
        if(!thislayer.empty()){
            result.push_back(thislayer);
            thislayer.clear();
            layer++;
        }
        return result;
    }
};