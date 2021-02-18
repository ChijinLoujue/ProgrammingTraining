//
// Created by ChijinLoujue on 2021/1/27.
//
#include <vector>
#include <iostream>
#include <math.h>
using namespace std;

class Solution {
public:
    vector<int> printNumbers(int n) {
        vector<int> number;
        int MAX_NUMBER = (int)(pow(10,n+1)-1);
        for(int i = 0;i<=MAX_NUMBER;++i){
            number.push_back(i);
        }
        return number;
    }

};

