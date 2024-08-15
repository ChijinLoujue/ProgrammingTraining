import java.util.*;

public class huawei16_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int N = in.nextInt();
            int M = in.nextInt();
            int[] Chengji = new int[N];
            String[] other = new String[M];
            for(int i=0;i<N;i++){
                Chengji[i]=in.nextInt();
            }
            for(int i=0;i<M;i++){
                other[i]=in.nextLine();
            }
        }
        in.close();
    }

}
