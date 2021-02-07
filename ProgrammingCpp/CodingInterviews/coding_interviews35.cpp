//
// Created by ChijinLoujue on 2021/2/7.
//


class Node {
public:
    int val;
    Node* next;
    Node* random;

    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};

class Solution {
public:
    Node* copyRandomList(Node* head) {
        CloneNodes(head);
        nextRandom(head);
        devideLink(head);
        return head;
    }
    void CloneNodes(Node* head){
        Node* node = head;
        while(node != NULL){
            Node* cloned = node;
            node->next = cloned;
            node = cloned->next;
        }
    }
    void nextRandom(Node* head){
        Node* node = head;
        while (node!= NULL){
            node=node->next;
            node->random = node->random->next;
            node = node->next;
        }
    }
    void devideLink(Node* head){
        head = head->next;
        Node* node = head;
        while (node->next!= NULL){
            node->next=node->next->next;
            node = node->next;
        }
    }
};