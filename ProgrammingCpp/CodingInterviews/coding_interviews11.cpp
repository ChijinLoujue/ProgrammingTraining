//
// Created by ChijinLoujue on 2021/1/23.
//
#include <vector>
using namespace std;
class Solution {
public:
    int minArray(vector<int>& numbers) {
        int length = numbers.size();
        if(length ==0){
            return -1;
        }
        int left_index = 0;
        int right_index = length-1;
        int mid_index = left_index;
        while(numbers[left_index]>=numbers[right_index]){
            if(right_index-left_index==1){
                mid_index = right_index;
                break;
            }
            mid_index = (left_index+right_index)>>1;
            if(numbers[mid_index]==numbers[left_index]
            && numbers[mid_index]==numbers[right_index]){
                return min_in_order(numbers,left_index,right_index);
            }

            if(numbers[mid_index]>=numbers[left_index]){
                left_index = mid_index;
            }else{
                right_index = mid_index;
            }
        }
        return numbers[mid_index];
    }
    int min_in_order(vector<int>& numbers,int left_index,int right_index){
        int result = numbers[left_index];
        for(int i = left_index+1;i<right_index;++i){
            if(result>numbers[i]){
                result = numbers[i];
            }
        }
        return result;
    }
};