//
// Created by ChijinLoujue on 2021/2/5.
//
#include <iostream>
#include <vector>
#include <stack>
using namespace std;
class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        vector<int>::iterator thispush = pushed.begin();
        vector<int>::iterator thispop = popped.begin();
        stack<int> stk;
        while (thispop!=popped.end()){
            if(stk.empty()){
                stk.push(thispush[0]);
                thispush++;
                continue;
            }
            if(thispop[0] == stk.top()){
                thispop++;
                stk.pop();
                continue;
            }else{
                if(thispush == pushed.end()){
                    break;
                }
                stk.push(thispush[0]);
                thispush++;
                continue;
            }

        }
        if(thispop!=popped.end()){
            return false;
        }else{
            return true;
        }
    }
};

//int main(){
//    vector<int> pushed = {1,2,3,4,5};
//    vector<int> popped ={4,5,3,2,1};
//    Solution solution = Solution();
//    cout << solution.validateStackSequences(pushed, popped) << endl;
//    return 1;
//}

//  pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
//
//[1,2,3,4,5]
//[4,5,3,2,1]