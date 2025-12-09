package huawei;

import java.util.Arrays;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int L = sc.nextInt();
            int S = sc.nextInt();
            int T = sc.nextInt();
            int N = sc.nextInt();
            int []stone = new int[N];
            for(int i = 0; i < N; i++){
                stone[i]= sc.nextInt();
            }
            int start =0;
            System.out.println(Times(L,S,T,stone,start));
        }

    }

    public static int Times(int L,int S,int T,int []stone,int start){
        if(L<=T)
            return 0;
        int len = stone.length;
        int IndexStart = 0;
        int LastTimes = len;
        for(int i = 0;i<len;++i){
            if(stone[i]-start<=T){
                if(stone[i]-start<S){
                    return LastTimes;
                }
                IndexStart =i;
                start = stone[IndexStart];
                L = L-start;
                int []NewStone = Arrays.copyOfRange(stone,IndexStart+1,len);
                int thisTimes = Times(L,S,T,NewStone,start);
                if( thisTimes<LastTimes)
                    LastTimes = thisTimes;
            }
            else break;
        }

        return LastTimes+1;
    }
//    public static int Times(int L,int S,int T,int []stone,int start){
//        if(L<=T)
//            return 0;
//        int len = stone.length;
//        int IndexStart = 0;
//        for(int i = 0;i<len;++i){
//            if(stone[i]-start<=T){
//                IndexStart =i;
//            }
//            else break;
//        }
//        start = stone[IndexStart];
//        L = L-start;
//        int []NewStone = Arrays.copyOfRange(stone,IndexStart+1,len);
//        return Times(L,S,T,NewStone,start)+1;
//    }

}
//L S T N

/*
10 2 3 5
2 3 5 6 7

10 2 3 9
1 2 3 4 5 6 7 8 9

* */
