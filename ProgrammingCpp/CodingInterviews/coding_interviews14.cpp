//
// Created by ChijinLoujue on 2021/1/24.
//

#include <cmath>

class Solution {
public:
    int cuttingRope(int n) {
        if(n < 2)
        {
            return 0;
        }
        if(n == 2)
        {
            return 1;
        }
        if(n == 3)
        {
            return 2;
        }
        int* max_n = new int[n+1];
        max_n[0] = 0;
        max_n[1] = 0;
        max_n[2] = 1;
        max_n[3] = 2;
        int max = 0;
        for(int i = 4;i<=n;i++)
        {
            max = 0;
            for(int j=1;j<=(i>>1);++j)
            {
                int temp = j*max_n[i-j];
                if(max<temp)
                {
                    max = temp;
                }
            }
            max_n[i] = max;
        }
        max = max_n[n];
        delete []max_n;
        return max;
    }
    int cuttingRope1(int n)
    {
        if(n<2)
        {
            return 0;
        }
        if(n == 2)
        {
            return 1;
        }
        if(n == 3)
        {
            return 2;
        }
        int timesof3 = n/3;
        int restof3 = n%3;
        if(restof3 == 0)
        {
            return (int)pow(3,timesof3);
        }
        if(restof3==1)
        {
            return (int)pow(3,timesof3-1)*4;
        }
        return (int)pow(3,timesof3)*2;

    }
};
