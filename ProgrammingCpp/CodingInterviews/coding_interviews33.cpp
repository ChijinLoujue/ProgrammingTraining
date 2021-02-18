//
// Created by ChijinLoujue on 2021/2/6.
//
#include <vector>
using namespace std;

class Solution {
public:
    bool verifyPostorder(vector<int>& postorder,int left, int right) {
        if(postorder.empty()){
            return true;
        }
        if(left==right){
            return true;
        }
        int length = postorder.size();
        int root = postorder[right];
        int i = left;
        for(;i<right;++i){
            if(postorder[i]>root){
                break;
            }
        }
        int j = i;
        for(;j<right;++j){
            if(postorder[j]<root){
                return false;
            }
        }
        bool leftsub = true;
        if(i>left){
            leftsub = verifyPostorder(postorder, left, i-1);
        }
        bool rightsub = true;
        if(i<right){
            rightsub = verifyPostorder(postorder,i,right-1);
        }
        return (leftsub&&rightsub);
    }

    bool verifyPostorder(vector<int>& postorder) {
        if(postorder.empty()){
            return true;
        }
        int length = postorder.size();
        return verifyPostorder(postorder,0, postorder.size()-1);
    }
};