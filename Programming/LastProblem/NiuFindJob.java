
import java.util.Scanner;

public class NiuFindJob{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int  WorknumN = myScanner.nextInt();
        int  FriendnumM = myScanner.nextInt();
        int[][] WorkInfo = new int[WorknumN][2];
        for(int n = 0;n<WorknumN;n++){
            WorkInfo[n][0]=myScanner.nextInt();
            WorkInfo[n][1]=myScanner.nextInt();
        }

        int[] FriendInfo = new int[FriendnumM];
        for(int m = 0;m<FriendnumM;m++){
            FriendInfo[m]=myScanner.nextInt();
        }
        paixu(WorkInfo);
        for(int i = 0;i<n;i++)
        System.out.println(WorkInfo[i][0]);

        int[] x = doSomething(WorkInfo,FriendInfo);
        for(int i = 0;i<x.length;i++)
        System.out.println(x[i]);
        myScanner.close();
    }

    
    public static void paixu(int[][] Array){
        
        int rows = Array.length;
        int columns = Array[0].length;
        for(int i = 0 ; i < rows-1; i ++){
            for(int j = 0 ;j < rows-1-i ; j++){
                int[] temp = new int[columns];
                if(Array[j][0] > Array[j+1][0]){
                    temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
    }

    public static int[] doSomething(int[][] WorkInfo,int[] FriendInfo){
        
        int cows = WorkInfo.length;
        
        int FriendM = FriendInfo.length;
        int[] ArrayMax = new int[FriendM];
        for(int m = 0;m<FriendM;m++){
            int i = 0;
            for(;i<cows;i++){
                if(FriendInfo[m]>=WorkInfo[i][0])
                break;
            }       
            ArrayMax[m] = WorkInfo[i][1];
            for (;i < cows; i++) {
                if (WorkInfo[i][1] > ArrayMax[m]) ArrayMax[m] = WorkInfo[i][1];
            }
        }
        return ArrayMax;
    }
}
