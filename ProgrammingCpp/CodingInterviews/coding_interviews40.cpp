//
// Created by ChijinLoujue on 2021/2/26.
//
#include <vector>
#include <string>
#include <iostream>
using namespace std;

class Solution {
public:

    int getLeastNumbers(vector<int>& arr, int left,int right) {
        int target = left;
        while(left<right){
            while(left<right && arr[left]<=arr[target])
                left++;
            while(left<right && arr[right]>arr[target])
                right--;
            int temp = arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
        }
        int temp = arr[target];
        arr[target]=arr[left];
        arr[left]=temp;
        return left;
    }
    template <typename T>
    vector<T> sub(vector<T>& arr, int left, int right){
        vector<T> sub;
        if(left>right)
            return sub;
        for(int i = left;i<=right;++i){
            sub.push_back(arr[i]);
        }
        return sub;
    }

    vector<int> getLeastNumbers(vector<int>& arr, int left, int right, int k) {
        int target = getLeastNumbers(arr,left,right);
        if(target==k)
            return sub(arr,0, k);
        return target>k-1? getLeastNumbers(arr, left, target-1,k):getLeastNumbers(arr,target+1,right,k);
    }
    vector<int> getLeastNumbers(vector<int>& arr, int k) {
        vector<int> result;
        if(k==0 || arr.size()==0)
            return result;
        return getLeastNumbers(arr, 0,arr.size()-1,k-1);
    }
};