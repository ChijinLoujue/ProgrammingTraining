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
//
//#include <iostream>
//using namespace std;
//int main()
//{
//    int score=0;
//    while (cin >> score)
//    {
//        try
//        {
//            if (score > 100 || score < 0)
//            {
//                throw score;
//            }
//            //将分数写入文件或进行其他操作
//        }
//        catch (int score)
//        {
//            cerr << "你输入的分数数值有问题，请重新输入！";
//            continue;
//        }
//    }
//}
//
//
///***********************************/
//#include <iostream>
//#include <string>
//using namespace std;
//string func(string s){
//    int len = s.length();  //原字符串长度
//
//    int current_index = 0;  //当前字符串起始
//    int current_sub = 1;   //当前字符串长度
//
//    int len_sub = 1;     //
//    int index_sub = 0;
//    for(int i = 1;i<len;i++){
//        if(s[i]-s[i-1]==1){
//            current_sub++;
//        }else{
//            if(current_sub>len_sub){
//                len_sub = current_sub;
//                index_sub = current_index;
//            }
//            current_sub = 1;
//            current_index = i;
//        }
//    }
//    if(current_sub>len_sub){
//        len_sub = current_sub;
//        index_sub = current_index;
//    }
//    return s.substr(index_sub,len_sub);
//
//}
//
//int main() {
//    //int a;
//    //cin >> a;
//    cout << "Hello World!" << endl;
//}
//#include <vector>
//using namespace std;
//struct TreeNode{
//    int val;
//    TreeNode* left;
//    TreeNode* right;
//};
//vector<int> func(TreeNode* root){
//    vector<int> result;
//    if(root != nullptr)
//        result.push_back(root->val);
//    else
//        return result;
//    vector<int> left_result = func(root->left);
//    vector<int> right_result = func(root->right);
//    vector<int>::iterator left = left_result.begin();
//    while(left != left_result.end()){
//        result.push_back(*left);
//        left++;
//    }
//    vector<int>::iterator right = right_result.begin();
//    while(right != right_result.end()){
//        result.push_back(*right);
//        right++;
//    }
//    return result;
//}

//#include<iostream>
//using namespace std;
//int main(){
//    int n,k;
//    cin >> n;
//    cin >> k;
//    int sum = 0;
//    int nk=k;
//    while(nk<=n){
//        sum+=nk*(n-nk+1);
//        nk +=k;
//    }
//    cout<< sum;
//
//}
//#include<iostream>
//#include<vector>
//#include<set>
//#include<algorithm>
//using namespace std;
//int main()
//{
//    int n;//砝码数
//    int m[10]={0};//每个砝码的质量
//    int x[10]={0};//每个砝码的数量
//    cout << "==============" << endl;
//    cin>>n;
//    for (int i = 0; i < n; i++)
//         cin >> m[i];
//    cout << "======="<<n<<"=======" << endl;
//    for (int i = 0; i < n; i++)
//        cin >> x[i];
//    cout << "======="<<n<<"=======" << endl;
//    for(int i = 0;i<n;i++){
//    cout << m[i];
//}
//}
//这下面是新建对象指针
//#include<iostream>
//#include<vector>
//#include<set>
//#include<algorithm>
//using namespace std;
//class Node {
//public:
//    int val;
//    Node* next;
//
//    Node(int _val) {
//        val = _val;
//        next = NULL;
//    }
//};
//struct TreeNode {
//    int val;
//    TreeNode *left;
//    TreeNode *right;
//    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
//};
//int main()
//{
//    Node* head = new Node(1);
//    Node* node = head;
//    for(int i = 0;i<3;i++){
//        Node* temp = new Node(i);
//        node->next = temp;
//        node = node->next;
//    }
//    TreeNode* x = new TreeNode(1);
//    TreeNode* root = new TreeNode(1);
//    TreeNode* branch = root;
//    for(int i = 0;i<3;i++){
//        TreeNode* temp = new TreeNode(i);
//        branch->left = temp;
//        branch = branch->left;
//    }
//
//
//}

#include <vector>
#include <string>
#include <iostream>

template <typename T>
void printVector(std::vector<T> v){
    int len = v.size();
    if(len = 0)
        return;
    std::cout << "[" ;
    for(auto n:v){
        std::cout << n << ", ";
    }
    std::cout << "]" <<std::endl;

}


std::vector<int> makeVector(){
    std::vector<int> result;
    int v[8] = {4,5,1,6,2,7,3,8};   //4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
    for(auto n : v){
        result.push_back(n);
    }
    return result;
}


class Solution {
public:

    int getLeastNumbers(std::vector<int>& arr, int left,int right) {
        int target = left;
        while(left<right){
            while(left<right && arr[right]>=arr[target])
                right--;
            while(left<right && arr[left]<=arr[target])
                left++;

            int temp = arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
        }
        int temp = arr[target];
        arr[target]=arr[left];
        arr[left]=temp;
        printVector(arr);
        std::cout << left <<std::endl;
        return left;
    }
    template <typename T>
    std::vector<T> sub(std::vector<T>& arr, int left, int right){
        std::vector<T> sub;
        if(left>right)
            return sub;
        for(int i = left;i<=right;++i){
            sub.push_back(arr[i]);
        }
        return sub;
    }

    std::vector<int> getLeastNumbers(std::vector<int>& arr, int left, int right, int k) {
        int target = getLeastNumbers(arr,left,right);
        if(target==k)
            return sub(arr,0, k);
        return target>k-1? getLeastNumbers(arr, left, target-1,k):getLeastNumbers(arr,target+1,right,k);
    }
    std::vector<int> getLeastNumbers(std::vector<int>& arr, int k) {
        std::vector<int> result;
        if(k==0 || arr.size()==0)
            return result;
        return getLeastNumbers(arr, 0,arr.size()-1,k-1);
    }
};

int main(){
    std::vector<int> v = makeVector();
    printVector(v);
    Solution solution = Solution();
    std::vector<int> s = solution.getLeastNumbers(v,4);
    printVector(s);
}