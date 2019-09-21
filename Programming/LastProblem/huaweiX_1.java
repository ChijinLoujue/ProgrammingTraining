import java.util.*;

public class huaweiX_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int N = in.nextInt();
            int M = in.nextInt();
            int[] Chengji=new int[N];
            for(int i=0;i<N;i++){
                Chengji[i]=in.nextInt();
            }
            for(int i=0;i<M;i++){
                String Op=in.next();
                int A = in.nextInt();
                int B = in.nextInt();
                //System.out.println("OK"+Op+A+B);
                switch (Op.charAt(0)) {
                    case 'Q':
                        if(A>B){
                            int t=A;
                            A=B;
                            B=t;
                        }
                        int Max=Chengji[A-1];
                        for(int k=A;k<B;k++){
                            if(Chengji[k]>Max)
                            Max=Chengji[k];
                        }
                        System.out.println(Max);
                        break;
                    case 'U':
                    Chengji[A-1]=B;
                        break;
                    default:
                        break;
                }
            }
        }
        in.close();
    }
}








