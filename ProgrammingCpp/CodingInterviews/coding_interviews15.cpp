//
// Created by ChijinLoujue on 2021/1/24.
//

#include <cstdint>

class Solution {
public:
    int hammingWeight(uint32_t n) {
        int t = 1;
        int count = 0;
        for(int i = 0;i<32;i++)
        {
            if(n & t)
            {
                count++;
            }
            t = t<<1;
        }
        return count;
    }
};