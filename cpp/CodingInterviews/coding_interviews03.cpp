//
// Created by ChijinLoujue on 2021/1/17.
//

#include "coding_interviews03.h"



int Solution::findRepeatNumber(vector<int>& nums) {
    int length = nums.size();
    if(length<=0){
        return -1;
    }
    for(int i=0;i<length;++i){
        if(nums[i]<0||nums[i]>length-1){
            return -1;
        }
    }
    for(int i=0;i<length;++i){
        while(nums[i]!=i){
            if(nums[i]==nums[nums[i]]){
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
    }
    return -1;
}

int Solution::findRepeatNumber1(vector<int>& nums) {
    int length = nums.size();
    if(length<=0){
        return -1;
    }
    int start = 0;
    int end = length-1;
    while(end>=start){
        int middle = ((end-start)>>1)+start;
        int count = this->countRange(nums,length,start,middle);
        if(start==end){
            if(count>1)
                return start;
            else
                break;
        }
        if(count>middle-start+1)
            end = middle;
        else
            start = middle+1;
    }
    return  -1;
}

int Solution::countRange(vector<int>& nums,int length,int start,int end){
    if(nums.empty()){
        return 0;
    }
    int count = 0;
    for(int i = 0;i<length;i++){
        if(nums[i]>=start&&nums[i]<=end)
            ++count;
    }
    return  count;
}





