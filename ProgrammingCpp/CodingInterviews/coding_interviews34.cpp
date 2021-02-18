//
// Created by ChijinLoujue on 2021/2/7.
//

#include <vector>
using namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    vector<vector<int>> pathSum(TreeNode* root, int sum) {
        vector<vector<int>> result;
        if(root == NULL){
            return result;
        }
        vector<int> path;
        int currentSum = 0;
        FindPath(root,sum,path,0,result);
        return result;
    }
    void FindPath(TreeNode* root, int sum, vector<int> &path,int currentsum, vector<vector<int>> &result){
        currentsum += root->val;
        path.push_back(root->val);
        //如果是叶子节点，并路径上节点值得和等于输入的值
        //则打印这条路径
        bool isLeaf = root->left==NULL&&root->right==NULL;
        if(currentsum==sum&&isLeaf){
            result.push_back(path);
        }
        if(root->left!=NULL){
            FindPath(root->left,sum,path,currentsum,result);
        }
        if(root->right!=NULL){
            FindPath(root->right,sum,path,currentsum,result);
        }
        path.pop_back();
    }
};