//
// Created by ChijinLoujue on 2021/1/23.
//

class Solution {
public:
    int fib(int n) {
        if(n<2){
            return n;
        }else{
            long a = 0;
            long b = 1;
            for(int i = 2;i<=n;++i){
                long temp = (a+b)%1000000007;
                a = b;
                b = temp;
            }
            return (int)b;
        }
    }
    int numWays(int n) {
        if(n <2){
            return 1;
        }
        long a = 1;
        long b = 1;
        for(int i = 2;i<=n;++i){
            long temp = (a+b)%1000000007;
            a = b;
            b = temp;
        }
        return (int)b;
    }
};