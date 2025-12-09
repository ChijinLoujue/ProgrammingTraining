//
// Created by ChijinLoujue on 2019/9/24.
//

#include <iostream>
#include <vector>
#include <array>
using namespace std;
int main() {
    vector<int> vi;

    cout<<"planning time = ";
    planning.Show();
    cout<<endl;

    cout<<"coding time = ";
    coding.Show();
    cout<<endl;

    cout<<"fixing time = ";
    fixing.Show();
    cout<<endl;

    //total = coding.Sum(fixing);
    //total = coding.operator+(fixing);
    total = coding+fixing;
    cout<<"total time = ";
    total.Show();
    cout<<endl;
    return 0;
}