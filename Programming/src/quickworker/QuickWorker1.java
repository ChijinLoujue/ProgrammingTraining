//quick worker No.1  列竖式

package quickworker;

import java.util.Scanner;

public class QuickWorker1 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][]si = new char[n][m];
        int []scare = new int[m];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String is = sc.nextLine();
            char [] scC = is.toCharArray();
            for(int j=0;j<m;++j)
            si[i][j]=scC[j];
        }
        for(int i = 0; i < m; i++){
            scare[i] = sc.nextInt();
        }
        int []luck = new int[m];
        for(int i=0;i<m;++i){
            int []tongji = new int[5];
            for(int j =0;j<5;++j)
                tongji[j]=0;
            for(int j =0;j<n;++j){
                int answer = si[j][i]-'A';
                tongji[answer]++;
            }
            luck[i] = zuida(tongji);
        }
        int aaaa =0;
        for(int i =0;i<m;++i){
            aaaa += luck[i]*scare[i];
        }
        System.out.println(aaaa);
    }

    public static int zuida(int []A){
        int max = A[0];
        for(int i =0;i<A.length;++i){
            if(A[i]>max)
                max = A[i];
        }
        return max;
    }

}
