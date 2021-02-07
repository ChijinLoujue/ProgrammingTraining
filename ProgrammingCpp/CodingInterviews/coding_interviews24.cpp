//
// Created by ChijinLoujue on 2021/2/3.
//

#include <iostream>
#include <cstdlib>
#include <stack>
using namespace std;
//Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

ListNode* buildListNode(int* x, int length) {
    ListNode* head;
    ListNode* link;
    for(int i=0;i<length;i++){
        ListNode temp(x[i]);
        link=&temp;
        link = link->next;
    }
    return head;
}

void printListNode(ListNode* head){
    ListNode* temp = head;
    while (temp){
        cout << temp->val <<"->";
        temp = temp->next;
    }
    cout << "NULL"<< endl;
}


class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* reverseHead = NULL;
        ListNode* node = head;
        ListNode* prev = NULL;
        while (node != NULL){
            ListNode* next = node->next;
            if(next==NULL)
                reverseHead = node;
            node->next=prev;
            prev = node;
            node = next;
        }
        return reverseHead;
    }
};

//int main(void){
//    int x[] = {1,2,3,4,5,6,7};
//    ListNode* head = buildListNode(x,7);
//    printListNode(head);
//    Solution solution = Solution();
//    ListNode* result = solution.reverseList(head);
//    printListNode(result);
//}