//
// Created by ChijinLoujue on 2021/2/13.
//


#include <iostream>
#include <vector>
#include <string>
using namespace std;
vector<string> defStr(string s){
    len = s.length();
    vector<string> str;
    if(str[0] != "["){
        return str;
    }
    if(str[len-1] != "]"){
        return str;
    }

    int left_index = 1;
    int right_index = 1;
    for(int i = 1;i<len-1;i++){
        string temp;
        if(s[i]==','){
            right_index = i;
        }
        temp = s.substr(left_index,right_index);
        str.push_back(temp);
        cout << temp<<endl;
        left_index = right_index;
    }
    return str;
}

int main(){
    string str = "[1,2,3,4,5]"
    vector<string> str= defStr(str);
}

