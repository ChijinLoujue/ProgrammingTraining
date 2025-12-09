//
// Created by ChijinLoujue on 2021/1/19.
//

#include <iostream>
#include <vector>
#include <string>
#include <stack>
using  namespace std;
/**
 * Definition for singly-linked list.
 **/
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    vector<int> reversePrint(ListNode* head) {
        stack<int> nodes;
        ListNode* p = head;
        int n = 0;
        while(p != NULL){
            nodes.push(p->val);
            n++;
            p = p->next;
        }
        vector<int> result;
        while(!nodes.empty()){
            result.push_back(nodes.top());
            nodes.pop();
        }
        return result;
    }
};

int DestroyList(ListNode *head)
{
    ListNode *p;
    if(head==NULL)
        return 0;
    while(head)
    {
        p=head->next;
        delete(head);
        head=p;
    }
    return 1;
}


int ci06_main()
{
    ListNode* head = new ListNode(0);
    ListNode* p = head;
    int hh = 1;
    int n;
    while(hh){
        while(cin >> n){
            if(n==-1)
                break;
            ListNode* temp = new ListNode(n);
            p->next = temp;
            p = p->next;
        }
        Solution solution;
        vector<int> list = solution.reversePrint(head->next);
        int len = list.size();
        for(int i = 0;i<len;i++){
            cout << list[i]<<endl;
        }
        list.clear();

    }
    return 0;
}