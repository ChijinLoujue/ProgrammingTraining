//
// Created by ChijinLoujue on 2021/2/6.
//

#ifndef PROGRAMMINGCPP_TREENODEMODULE_H
#define PROGRAMMINGCPP_TREENODEMODULE_H

#include <vector>
#include <queue>
using namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class TreeNodeModule {
public:
    TreeNodeModule();
    ~TreeNodeModule();
    TreeNode* makeTreefromNums(vector<int> nums, int nullmarke = 0);

private:

};


#endif //PROGRAMMINGCPP_TREENODEMODULE_H
