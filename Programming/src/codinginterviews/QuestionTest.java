package codinginterviews;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionTest {
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
        System.out.println((matrix.length));
        System.out.println((matrix[0].length));
        String str = Arrays.deepToString(matrix);
        System.out.println(str);
    }
}
/*
4 4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
 */
