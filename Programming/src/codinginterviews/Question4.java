package codinginterviews;

import java.util.Scanner;


/*
7
4 4
1 2 8 9
2 4 9 12
4 7 10 13
6 8 11 15
* */
public class Question4 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]data = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for(int j =0;j<n;++j){
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println(Find(k,data));
    }

    public static boolean Find(int target,int [][]array){
        int rows = array.length;
        int columns = array[0].length;
        boolean find = false;
        if(columns>0&&rows>0){
            int row = 0,column = columns-1;
            while (row<rows&&column>=0){
                if(target==array[row][column]){
                    find =true;
                    break;
                }
                if(target>array[row][column]){
                    ++row;
                }else{
                    --column;
                }
            }
        }
        return find;
    }
// 16,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
}

//    public static <T> T[][] copy2(T[][] Array,int rowsFirst,int rowsEnd,int columnsFirst,int columnsEnd){
//        int rows = rowsEnd-rowsFirst+1;
//        int columns = columnsEnd-columnsFirst+1;
//
//        if(rows<=0||columns<=0){
//            return Array;
//        }
//        T [][]ArrayCopy = (T[][])new Object[columns][rows];
//        for(int i=0;i<columns;++i){
//            for (int j=0;i<rows;++j){
//                ArrayCopy[i][j] = Array[rowsFirst+i][columnsFirst+j];
//            }
//        }
//        return ArrayCopy;
//    }

