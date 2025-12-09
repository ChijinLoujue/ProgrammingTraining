//
// Created by ChijinLoujue on 2021/2/28.
//

#include<iostream>
#include<vector>
#include<set>
#include<algorithm>
using namespace std;
class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
        int index = 0;
        string rule[3] = {"type", "color", "name"};
        for(;index<3;index++){
            if(ruleKey == rule[index])
                break;
        }
        if(index>=3)
            return 0;
        int count = 0;
        int len = items.size();
        for(int i=0;i<len;i++){
            if(items[i][index]==ruleValue){
                count++;
            }
        }
        return count;
    }
};
