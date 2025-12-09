//
// Created by ChijinLoujue on 2021/2/21.
//
#include <string>
#include <iostream>
using namespace std;
class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string result = "";
        long len1 = word1.length();
        long len2 = word2.length();
        long minlen = min(len1,len2);
        if(len1 == 0 && len2 == 0)
            return result;
        long index= 0;
        while(index <minlen){
            result += word1[index];
            result += word2[index];
            index++;
        }
        if(len1 <len2){
            while(index < len2){
                result += word2[index];
                index++;
            }
        }
        if(len1 > len2){
            while(index < len1){
                result += word1[index];
                index++;
            }
        }
        return result;
    }
};

//int main(){
//    Solution s = Solution();
//    string result = s.mergeAlternately("12345", "abcde");
//    cout << result <<endl;
//}