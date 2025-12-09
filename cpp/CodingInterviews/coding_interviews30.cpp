//
// Created by ChijinLoujue on 2021/2/5.
//
#include <iostream>
#include <stack>
#include <stdlib.h>
using namespace std;
class MinStack {

private:
    stack<int> stk;
    stack<int> min_stk;
    int min_int;

public:
    /** initialize your data structure here. */
    MinStack() {

    }

    void push(int x) {
        if(stk.empty()){
            min_int = x;
        } else{
            if(x < min_int){
                min_int = x;
            }
        }
        stk.push(x);
        min_stk.push(min_int);
    }

    void pop() {
        if(stk.empty()){
            return;
        }
        stk.pop();
        min_stk.pop();
        min_int = min();
    }

    int top() {
        if(stk.empty()){
            return -1;
        }
        return stk.top();
    }

    int min() {
        if(min_stk.empty()){
            return -1;
        }
        return min_stk.top();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(x);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->min();
 */


/*
["MinStack","push","push","min","min","push","min","min","top","min","pop","push","push","min","push","pop","top","min","pop"]
[  [],       [-10],[14],    [],   [], [-20],   [],  [],   [],   [],   [],   [10],  [-7], [],   [-7],   [],   [],   [],   []]
[null,       null, null,    -10,  -10, null,  -20, -20,  -20,  -20, null,    null, null, -20,  null,  null,   -7,  -20,  null]
[null,       null,  null,   -10,  -10, null,  -20, -20,  -20,  -20, null,    null,  null, -10, null,   null,   -7,  -10, null]
    stk -10  14 -20
min_stk -10 -10 -20
 * */