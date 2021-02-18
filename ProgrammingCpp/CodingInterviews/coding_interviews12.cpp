//
// Created by ChijinLoujue on 2021/1/24.
//
#include <vector>
#include <string>

using namespace std;
class Solution {
public:
    int rows, columns;
    bool exist(vector<vector<char>>& board, string word) {
        if(board.empty()||word.empty()){
            return false;
        }
        rows = board.size();
        columns = board[0].size();
        vector<bool> visited;
        int pathLength = 0;
        for(int row = 0;row<rows;row++){
            for(int column = 0;column<columns;column++)
            {
                if(hasPathCore(board,row,column,word,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    bool hasPathCore( vector<vector<char>>& matrix,
            int row, int column,
            const string str, int k
              ){
        if(row<0||column<0||row>=rows||column>=columns||matrix[row][column] != str[k] )
        {
            return false;
        }
        if(k==str.size()-1)
        {
            return true;
        }
        matrix[row][column] = '\0';
        bool result = hasPathCore(matrix, row,column-1,str,k+1)||
                hasPathCore(matrix, row-1,column,str,k+1)||
                hasPathCore(matrix, row,column+1,str,k+1)||
                hasPathCore(matrix, row+1,column,str,k+1);
        matrix[row][column] = str[k];
        return result;
    }
};



//class Solution {
//public:
//    bool exist(vector<vector<char>>& board, string word) {
//        rows = board.size();
//        cols = board[0].size();
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < cols; j++) {
//                if(dfs(board, word, i, j, 0)) return true;
//            }
//        }
//        return false;
//    }
//private:
//    int rows, cols;
//    bool dfs(vector<vector<char>>& board, string word, int i, int j, int k) {
//        if(i >= rows || i < 0 || j >= cols || j < 0 || board[i][j] != word[k]) return false;
//        if(k == word.size() - 1) return true;
//        board[i][j] = '\0';
//        bool res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
//                   dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
//        board[i][j] = word[k];
//        return res;
//    }
//};
//
//作者：jyd
//        链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/solution/mian-shi-ti-12-ju-zhen-zhong-de-lu-jing-shen-du-yo/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。