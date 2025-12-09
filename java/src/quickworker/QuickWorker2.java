//Quick Worker No. 2 二进制字符串中固定k个1的字串有多少个


package quickworker;

import java.util.Scanner;

public class QuickWorker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String bits = sc.nextLine();
        char [] bitsC = bits.toCharArray();
        int []bitsI =new int[bitsC.length];
        for(int i=0;i<bitsC.length;++i){
            bitsI[i] = bitsC[i]-'0';
        }
        System.out.println(zichuan(bitsI,k));
    }

    public static int zichuan(int []bits,int k){
        int len = bits.length;
        int he = oneNum(bits);

        if(he<k){
            return 0;
        }
        int indexlen =he+2;
        int []index1 = new int[indexlen];
        int indextemp =0;
        index1[indextemp]=-1;
        for(int i=0;i<len;++i){
            if(bits[i]==1){
                ++indextemp;
                index1[indextemp]=i;
            }
        }
        index1[indexlen-1] = len;
        int total =0;
        if(k==0){
            for(int i=1;i<indexlen;++i){
                int temp =ziNum(index1[i]-index1[i-1]-1);
                total += temp;
            }
            return total;
        }else {
            for (int i = 1; i < indexlen - k; ++i) {
                int temp = (index1[i] - index1[i - 1]) * (index1[i + k] - index1[i + k - 1]);
                total += temp;
            }
            return total;
        }

    }
    public static int oneNum(int []bits){
        int he =0;
        for(int i = 0;i<bits.length;++i){
            he=he+bits[i];
        }
        return he;
    }
    public static int ziNum(int len){
        if(len ==0){
            return 0;
        }
        int num =0;
        for(int i =1;i<=len;++i){
            num +=i;
        }
        return num;
    }

}