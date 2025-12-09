package codinginterviews;

import java.util.ArrayList;
import java.util.Scanner;

public class Question29 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]matrix = new int[m][n];
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(printMatrix(matrix));
    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix==null)
            return null;
        int rows = matrix.length;
        int columns = matrix[0].length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(rows==1||columns==1){
           for(int i=0;i<rows;++i){
               for (int j=0;j<columns;++j){
                   result.add(matrix[i][j]);
               }
           }
        }else {
            for(int i=0;i<columns-1;++i){
                result.add(matrix[0][i]);
            }
            for(int i=0;i<rows-1;++i){
                result.add(matrix[i][columns-1]);
            }
            for(int i=columns-1;i>0;--i){
                result.add(matrix[rows-1][i]);
            }
            for(int i=rows-1;i>0;--i){
                result.add(matrix[i][0]);
            }
        }
        if(rows>2&&columns>2){
            int [][]ziMatrix = new int[rows-2][columns-2];
            for(int i=0;i<rows-2;++i){
                for (int j=0;j<columns-2;++j){
                    ziMatrix[i][j]=matrix[i+1][j+1];
                }
            }
            ArrayList<Integer> ziResult = printMatrix(ziMatrix);
            result.addAll(ziResult);
        }
        return result;
    }
}
/*
2 2
1 2
3 4
 */