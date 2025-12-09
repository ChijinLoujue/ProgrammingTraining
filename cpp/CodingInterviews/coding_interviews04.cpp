//
// Created by ChijinLoujue on 2021/1/19.
//

#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    bool findNumberIn2DArray(vector<vector<int>>& matrix, int target) {
        if(matrix.empty())
            return  false;
        int rows = matrix.size();
        int columns = matrix[0].size();
        int row = 0;
        int column = columns-1;
        while(row<rows && column>=0){
            if(matrix[row][column] == target){
                return true;
            }
            else if(matrix[row][column] > target){
                --column;
            }else{
                ++row;
            }
        }
        return false;
    }
};