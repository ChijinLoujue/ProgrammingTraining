package codinginterviews;

import java.util.Scanner;

public class Question3 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []data = new int[n];
        for (int i = 0; i < n; ++i) {
            data[i] = sc.nextInt();
        }
        System.out.println(repeatNum(data));
    }

    public static int repeatNum(int []data){
        int dataLen = data.length;
        if(data == null||dataLen<=0){
            return -1;
        }
        for(int i = 0;i<dataLen;++i){
            if(data[i]<0||data[i]>dataLen){
                return -1;
            }
        }
        for (int i=0;i<dataLen;++i){
            while (data[i]!=i){
                if(data[i]==data[data[i]]){
                    return data[i];
                }
                int temp = data[i];
                data[i] = data[temp];
                data[temp]= temp;
            }
        }
        return -1;
    }
}
