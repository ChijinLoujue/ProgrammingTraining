//
// Created by ChijinLoujue on 2021/1/17.
//

#ifndef PROGRAMMINGCPP_CODING_INTERVIEWS03_H
#define PROGRAMMINGCPP_CODING_INTERVIEWS03_H

#endif //PROGRAMMINGCPP_CODING_INTERVIEWS03_H
#include <iostream>
#include <vector>
#include <string>
using namespace std;
class Solution {
public:
    int findRepeatNumber(vector<int> &nums);
    int findRepeatNumber1(vector<int> &nums);

private:
    int countRange(vector<int>& nums,int length,int start,int end);
};