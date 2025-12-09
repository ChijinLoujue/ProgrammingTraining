import java.util.Scanner;
import java.util.*;
public class Tencent2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = Integer.parseInt(in.nextLine());
            int len =(int)Math.pow(2,n);
            int[] origin = new int[len];
            for(int i=0;i<len;i++){
                origin[i]=in.nextInt();

            }
            
            int m =in.nextInt();
            int max =0;
            for(int j=0;j<m;j++){
                int qi =in.nextInt();
                int val =(int)Math.pow(2,qi);
                origin =parse(origin,val);
                max=Math.max(max,getCount(origin));
            }

            System.out.println(max);
        }
    }
    private static int getCount(int[] origin){
        int result =0;
        int len =origin.length;
        for(int i=0;i<len;i++){
            int start=origin[i];
            for(int j =i;j<len;j++){
                int end =origin[j];
                if(start>end){
                    result++;
                }
            }
        }
        return result;
    }

    public static int[] parse(int[] x, int val){
            return x;
    }
}