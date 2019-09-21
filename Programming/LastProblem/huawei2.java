
//huawei Q2
//quchong he paixu

import java.util.*;

public class huawei2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] inArray = new int[n];
            for(int i=0;i<n;i++){
                inArray[i] = in.nextInt();
            }
            Arrays.sort(inArray);

            for(int i=1;i<n;i++){
                while(inArray[i]==inArray[i-1]&&(inArray[i]!=-1)){
                    for(int j=i+1;j<n;j++){
                        inArray[j-1]=inArray[j];
                    }
                    inArray[n-1]=-1;
                }
            }
            for(int i=0;i<n;i++){
                if(inArray[i]==-1)
                    break;
                System.out.println(inArray[i]);
            }
        }
        in.close();
    }
}