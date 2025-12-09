//
// Created by ChijinLoujue on 2021/2/9.
//


// Definition for a Node.
class Node {
public:
    int val;
    Node* left;
    Node* right;

    Node() {}

    Node(int _val) {
        val = _val;
        left = NULL;
        right = NULL;
    }

    Node(int _val, Node* _left, Node* _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

class Solution {
public:
    Node* treeToDoublyList(Node* root) {
        Node* lastNode = NULL;
        ConverNode(root, lastNode);
        Node* head = lastNode;
        while(head!=NULL && head->left != NULL){
            head = head->left;
        }
        if(lastNode != NULL && head != NULL){
            lastNode->right = head;
            head->left = lastNode;
        }
        return head;
    }

    void ConverNode(Node* node, Node* &lastNode){
        if(node == NULL){
            return;
        }
        Node* current = node;
        if(current->left != NULL ){
            ConverNode(current->left, lastNode);
        }
        current->left = lastNode;
        if(lastNode != NULL){
            lastNode->right = current;
        }
        lastNode = current;
        if(current->right != NULL){
            ConverNode(current->right, lastNode);
        }

    }

};