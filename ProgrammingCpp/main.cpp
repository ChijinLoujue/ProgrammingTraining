#include <iostream>
#include <string.h>
#include <vector>

//#include "operator/mytime0.h"

    using namespace std;


int main() {
     vector<int> vec;

     cout<<"vector size="<< vec.size()<<endl;
     for(int i = 0;i<5;++i){
         vec.push_back(i);
     }
    cout<<"size = "<<vec.size()<<endl;
    for(int i = 0;i<5;++i){
        cout<<"value ["<<i<<"]<<="<<vec[i]<<endl;
    }
    vector<int>::iterator v = vec.begin();
    while(v!=vec.end()){
        cout<<"v="<<*v<<endl;
        v++;
    }
    return 0;

}