//
//#include <iostream>
//#include <string.h>
//#include <vector>
//
////#include "operator/mytime0.h"
//
//    using namespace std;
//
//
//int main() {
//     vector<int> vec;
//
//     cout<<"vector size="<< vec.size()<<endl;
//     for(int i = 0;i<5;++i){
//         vec.push_back(i);
//     }
//    cout<<"size = "<<vec.size()<<endl;
//    for(int i = 0;i<5;++i){
//        cout<<"value ["<<i<<"]<<="<<vec[i]<<endl;
//    }
//    vector<int>::iterator v = vec.begin();
//    while(v!=vec.end()){
//        cout<<"v="<<*v<<endl;
//        v++;
//    }
//    return 0;
//}

//#include <iostream>
//#include <vector>
//#include <string>
//#include "operator/mytime0.h"
//#include "CodingInterviews/coding_interviews03.h"
//    using namespace std;
//
//
//#define OPERATOR_MAIN 1001
//int operator_main() {
//    Time planning;
//    Time coding(2,40);
//    Time fixing(5,55);
//    Time total;
//
//    cout<<"planning time = ";
//    planning.Show();
//    cout<<endl;
//
//    cout<<"coding time = ";
//    coding.Show();
//    cout<<endl;
//
//    cout<<"fixing time = ";
//    fixing.Show();
//    cout<<endl;
//
//    //total = coding.Sum(fixing);
//    //total = coding.operator+(fixing);
//    total = coding+fixing;
//    cout<<"total time = ";
//    total.Show();
//    cout<<endl;
//    return 0;
//}
//
//#define CODING_MAIN_03 3
//int coding_main_03()
//{
//    int n = 0;
//    vector<int>nums;
//    while(1){
//        while(cin >> n){
//            if(n==-1)
//                break;
//            nums.push_back(n);
//        }
//        Solution solution;
//        cout << solution.findRepeatNumber1(nums)<<endl;
//        nums.clear();
//    }
//
//    return 0;
//}
//
//
//int main_index = CODING_MAIN_03;
//int dd_main() {
//    switch(main_index){
//        case(OPERATOR_MAIN):
//            return operator_main();
//        case(CODING_MAIN_03):
//            return coding_main_03();
//    }
//
//}
//#include<stdio.h>
//void add(int *p)
//{
//    (*p)++;
//    printf("%d",*p);
//    if (*p>5)
//    {
//        return;
//    }
//    add(p);
//}
//int main()
//{
//    int i=0;
//    add(&i);
//    return 0;
//}
//
//#include<iostream>
//#include<string>
////#include <stdio.h>
//#include<ctype.h>
//using namespace std;
//
//int main(void){
//    string s;
//    char c;
//    int result;
//    while(1){
//        getline(cin,s);
//        cout << "=================\n";
//        cin>>c;
//
//        result = 0;
//        int length = s.length();
//        for(int i = 0;i<length;i++){
//            if(tolower(s[i])==tolower(c)){
//                result++;
//            }
//        }
//        cout << result << endl;
//    }
//    return 0;
//}
//


//#include <iostream>
//#include <string>
//using namespace std;
//string zeors[] = {"","0","00","000","0000","00000","000000","0000000"};
//void print8(string s){
//    int len = s.length();
//    if(len == 0){
//        return;
//    }
//    if(len <= 8 ){
//        cout << s << zeors[8-len] <<endl;
//    }
//    else{
//        cout << s.substr(0,8)<<endl;
//        print8(s.substr(8,len-8));
//    }
//}
//int main() {
//    string s;
//    while (cin >> s) { // 注意 while 处理多个 case
//        // 64 位输出请用 printf("%lld")
//        print8(s);
//
//    }
//}
//
//#include <iostream>
//#include <string>
//#include <map>
//using namespace std;
//
//long pow(int x, int y){
//    if(y<0){
//        return -1;
//    }
//    if(y == 0){
//        return 1;
//    }
//    long result = 1;
//    for(int i = 0;i<y;i++){
//        result *= x;
//    }
//    return result;
//}
//
//void dosomething(string s){
//    int len = s.length();
//    if(len <3){
//        return;
//    }
//    if(s[0] !='0' || s[1] !='x'){
//        return;
//    }
//    int num = 0;
//    map<char,int> HHH = {{'0',0},
//                             {'1',1},
//                             {'2',2},
//                             {'3',3},
//                             {'4',4},
//                             {'5',5},
//                             {'6',6},
//                             {'7',7},
//                             {'8',8},
//                             {'9',9},
//                             {'A',10},
//                             {'B',11},
//                             {'C',12},
//                             {'D',13},
//                             {'E',14},
//                             {'F',15}
//    };
//    int Exponent = 0;
//    int base = 0;
//    long result = 0;
//    for(int i = len-1;i>1;i--){
//
//        base = HHH.at(s[i]);
//        result += base*pow(16,Exponent);
//        Exponent++;
//    }
//    cout << result <<endl;
//}
//int main() {
//    string s;
//    while (cin >> s) { // 注意 while 处理多个 case
//        // 64 位输出请用 printf("%lld")
//        dosomething(s);
//
//    }
//}

//#include <iostream>
//using namespace std;
//int main(){
//    int i = 5;
//    cout << i << endl;
//    i++;
//    cout << i << endl;
//}


//
//#include <iostream>
//using namespace std;
//void add(int a, int b){
//    cout << a <<endl;
//    cout << b <<endl;
//}
//
//int main(){
//    int a = 5;
//    int b = 5;
//    add(a++, ++a);
//}
//
//#include <iostream>
//int main(){
//    int a = 10;
//    int* p = &a;
//    int*q = p;
//    std::cout << "*p = " << *p <<std::endl;
//    std::cout << "*q = " << *q <<std::endl;
//    *q += 1;
//    std::cout << "*p = " << *p <<std::endl;
//    std::cout << "*q = " << *q <<std::endl;
//
//}


//
//#include <iostream>
//#include <vector>
//#include <string>
//using namespace std;
//vector<string> defStr(string s){
//    int len = s.length();
//    vector<string> str;
//    if(s[0] != '['){
//        return str;
//    }
//    if(s[len-1] != ']'){
//        return str;
//    }
//
//    int left_index = 0;
//    int right_index = 1;
//    string temp;
//    for(int i = 1;i<len-1;i++){
//        if(s[i]==','){
//            right_index = i;
//            temp = s.substr(left_index+1,right_index-left_index-1);
//            str.push_back(temp);
//            cout << temp<<endl;
//            left_index = right_index;
//        }
//    }
//    right_index = len-1;
//    temp = s.substr(left_index+1,right_index-left_index-1);
//    str.push_back(temp);
//    cout << temp<<endl;
//    return str;
//}

//int main(){
//    string str = "[1,2,3,4,5]";
//    vector<string> str1= defStr(str);
//}

//
//#include <iostream>
//#include <vector>
//#include <string>
//using namespace std;
//
//int main(){
//    string s = "1";
//    int x = atoi(s.c_str());
//    cout << x <<endl;
//}

#include <iostream>
#include <vector>
#include <string>
using namespace std;


int main() {
    int* x;
    *x = 10;
    cout << &x << endl;
}