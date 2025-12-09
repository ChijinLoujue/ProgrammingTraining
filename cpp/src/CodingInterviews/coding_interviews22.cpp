//
// Created by ChijinLoujue on 2021/1/28.
//

#include <cstdlib>

/**
 * Definition for singly-linked list.

 */
 struct ListNode {
         int val;
         ListNode *next;
         ListNode(int x) : val(x), next(NULL) {}
     };
class Solution {
public:
    ListNode* getKthFromEnd(ListNode* head, int k) {
        ListNode* temp = head;
        while(k--){
            if(temp){
                temp = temp->next;
            } else{
                return NULL;
            }
        }
        while(temp){
            head =head->next;
            temp = temp->next;
        }
        return head;
    }
};
//[1,2,3,4,5]
//2