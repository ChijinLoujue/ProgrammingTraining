//
// Created by ChijinLoujue on 2021/1/16.
//
#include <iostream>
#include <vector>

using namespace std;
class Solution {
public:
    void dfs(int x, vector<vector<int>> &edge, vector<int> &vis) {    //定义一个函数
        vis[x] = true; //把第x点设为真
        for (auto &y : edge[x]) {      //y是x的所有连接点
            if (!vis[y]) {     //如果y点有不是真的话
                dfs(y, edge, vis);     //就把y点设真
            }
        }
    }

    int removeStones(vector<vector<int>> &stones) {
        int n = stones.size();    //获得总共的长度
        vector<vector<int>> edge(n); //定义总长为n的
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    edge[i].push_back(j);  //建立网络
                }
            }
        }
        vector<int> vis(n);    //定义一个？？int
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {             //如果vis此值不等于0，计数，并传值
                num++;
                dfs(i, edge, vis);  //把这个点和他的所有连接点设置成真
            }
        }
        return n - num;
    }
};
