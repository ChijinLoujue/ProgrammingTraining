//
// Created by ChijinLoujue on 2021/1/23.
//
#include <vector>
#include <stack>
using namespace std;
class CQueue {
public:
    stack<int> stack1;
    stack<int> stack2;
    CQueue() {
    }

    void appendTail(int value) {
        stack1.push(value);
    }

    int deleteHead() {
        if(stack2.empty()){
            while(stack1.size()){
                stack2.push(stack1.top());
                stack1.pop();
            }
        }
        if(stack2.size()){
            int head = stack2.top();
            stack2.pop();
            return head;
        }else{
            return -1;
        }
    }
};

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue* obj = new CQueue();
 * obj->appendTail(value);
 * int param_2 = obj->deleteHead();
 */