//
// Created by ChijinLoujue on 2021/3/1.
//

#include <iostream>
#include <string>
#include <memory>
int autoprt1(){
    using namespace std;
    shared_ptr<string> films[5]={
            shared_ptr<string> (new string("0000")),
            shared_ptr<string> (new string("1111")),
            shared_ptr<string> (new string("2222")),
            shared_ptr<string> (new string("3333")),
            shared_ptr<string> (new string("4444"))
    };
    shared_ptr<string> p;
    p = films[2];
    cout<<"==============="<<endl;
    cout<< *p << endl;
    cout<<"==============="<<endl;
    for(int i = 0;i < 5; i++){
        cout << *films[i]<<endl;
    }
    return 0;
}

