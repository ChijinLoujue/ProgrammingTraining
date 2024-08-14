//
// Created by ChijinLoujue on 2021/2/21.
//
#include <vector>
#include <string>
#include <iostream>
using namespace std;
class Solution {
public:
    vector<int> minOperations(string boxes) {
        int len = boxes.length();
        vector<int> BOXes;
        int sum1 = 0;
        int bot = 0;
        for(int i = 0;i<len ;i++){
            int temp = int(boxes[i])-48;
            BOXes.push_back(temp);
            if(temp == 1){
                sum1++;
                bot += (i+1);
            }
        }
        vector<int> result(len);
        int left = 0;
        int right = sum1;
        for(int i = 0;i<len ;i++){
            bot = bot-right+left;
            result[i] = bot;
            if(BOXes[i]==1){
                right--;
                left++;
            }
        }
        return result;

    }
};
//int main(){
//    Solution s = Solution();
//    vector<int> result = s.minOperations("001011");
//    for(int i = 0; i< result.size();i++){
//        cout << result[i] <<" ";
//    }
//    cout <<endl;
//}