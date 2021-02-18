//
// Created by ChijinLoujue on 2021/1/19.
//

#include <iostream>
#include <vector>
#include <string>
using  namespace std;
class Solution {
public:
    string replaceSpace(string s) {
        if(s.empty())
            return s;
        while(s.find(" ")){
            s.replace(s.find(" "),1,"%20");
        }
        return s;
//        int count = 0;
//        for(int i = 0;i<s.size();i++){
//            if(s[i] == ' '){
//                count++;
//            }
//        }
//        if(count == 0){
//            return s;
//        }



    }
};
int coding_interviews05_main(void){
    while(1){
        string s;
        scanf("%s",&s);
        getchar();
        Solution solution;
        cout << solution.replaceSpace(s)<<endl;
    }

}