//
// Created by ChijinLoujue on 2021/2/10.
//

#include <string>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 };

#include <queue>
#include <vector>
#include <string>
class Codec {
public:
    vector<string> defStr(string s){
        int len = s.length();
        vector<string> str;
        if(s[0] != '['){
            return str;
        }
        if(s[len-1] != ']'){
            return str;
        }

        int left_index = 0;
        int right_index = 1;
        string temp;
        for(int i = 1;i<len-1;i++){
            if(s[i]==','){
                right_index = i;
                temp = s.substr(left_index+1,right_index-left_index-1);
                str.push_back(temp);
                cout << temp<<endl;
                left_index = right_index;
            }
        }
        right_index = len-1;
        temp = s.substr(left_index+1,right_index-left_index-1);
        str.push_back(temp);
        cout << temp<<endl;
        return str;
    }

    // Encodes a tree to a single string.
    string serialize(TreeNode* root) {
        queue<TreeNode*> que;
        vector<string> ser;
        if(root == NULL){
            return "[]";
        }
        que.push(root);
        while(!que.empty()){
            TreeNode* node = que.front();
            que.pop();
            if(node == NULL){
                ser.push_back("null");
            }
            else{
                ser.push_back(to_string(node->val));
                que.push(node->left);
                que.push(node->right);
            }
        }
        vector<string>::iterator iter = ser.begin();
        string  str1 = "[";
        while(iter != ser.end()){
            str1.append(*iter);
            str1.append(",")
            iter++;
        }
        str1.append("]");
        return str1;
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
        vector<string> str = defStr(data);
        if(str.size()==0){
            return NULL;
        }
        vector<string>::iterator iter = str.begin();
        queue<TreeNode*> que;
        TreeNode* root;
        que.push(root);
        while(iter != str.end()){
            if(*iter != "null"){
                TreeNode* temp = que.front();
                cout << "***:" << temp << endl;
                que.pop();
                int x = atoi((*iter).c_str());
                cout << "###:" << x << endl;
                temp->val = x;
                cout << "***L:" << temp->left << endl;
                cout << "***R:" << temp->right<< endl;
                cout << "^^^:" << x << endl;
                cout << "v1:" << que.size() << endl;
                que.push(temp->left);
                cout << "v2:" << que.size() << endl;
                que.push(temp->right);
                cout << "v3:" << que.size() << endl;
            }else{
                que.pop();
            }
            iter++;
        }
        return root;
    }
};

// Your Codec object will be instantiated and called as such:
// Codec codec;
// codec.deserialize(codec.serialize(root));