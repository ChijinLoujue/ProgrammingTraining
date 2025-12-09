//
// Created by ChijinLoujue on 2021/1/27.
//
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> exchange(vector<int>& nums) {
        if(nums.empty()){
            return nums;
        }
        vector<int>::iterator odd = nums.begin();
        vector<int>::iterator even = nums.end()-1;     //Odd and even 奇数 左 偶数 右
        while(odd <= even){
            if(even[0]%2==1 && odd[0]%2==0){
                int temp = odd[0];
                odd[0] = even[0];
                even[0] = temp;
            }
            if(odd[0]%2==1){
                odd++;
            }
            if(even[0]%2==0){
                even--;
            }
        }
        return nums;
    }
};