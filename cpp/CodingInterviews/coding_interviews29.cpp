//
// Created by ChijinLoujue on 2021/2/5.
//
#include <vector>
using namespace std;
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        if(matrix.size()==0 || matrix[0].size()==0){
            return result;
        }
        int rows = matrix.size();
        int columns = matrix[0].size();
        int start = 0;
        while(columns >start*2 && rows >start*2){
            addMatrixInCircle(matrix,rows,columns,start,result);
            start++;
        }
        return result;
    }
    void addMatrixInCircle(vector<vector<int>>& matrix,int rows, int columns, int start, vector<int>& result){
        int endX = columns-1-start;
        int endY = rows-1-start;
        for(int i = start;i<=endX;++i){
            result.push_back(matrix[start][i]);
        }
        if(start<endY){
            for(int i = start+1;i<=endY;++i){
                result.push_back(matrix[i][endX]);
            }
        }
        if(start<endX&&start<endY){
            for(int i = endX-1;i>=start;--i){
                result.push_back(matrix[endY][i]);
            }
        }
        if(start<endX&&start<endY-1){
            for(int i = endY-1;i>start;i--){
                result.push_back(matrix[i][start]);
            }
        }
    }
};