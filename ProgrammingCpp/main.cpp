#include <iostream>
#include "operator/mytime0.h"
    using namespace std;
int main() {
    Time planning;
    Time coding(2,40);
    Time fixing(5,55);
    Time total;

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