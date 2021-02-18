//
// Created by ChijinLoujue on 2021/1/27.
//



#include <cstdlib>

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* deleteNode(ListNode* head, int val) {
        ListNode* temp = head;
        if(head->val == val){
            return head->next;
        }else{
            while (temp->next != nullptr){
                if(temp->next->val == val){
                    temp->next = temp->next->next;
                    break;
                }
                temp = temp->next;
            }
        }
        return head;

    }
};