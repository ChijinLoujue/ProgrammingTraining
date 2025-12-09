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

    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null||length<=0){
            return false;
        }
        if(numbers.length != length)
            return false;

        for(int i = 0;i<length;++i){
            if(numbers[i]<0||numbers[i]>length){
                return false;
            }
        }
        for (int i=0;i<length;++i){
            while (numbers[i]!=i){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp]= temp;
            }
        }
        return false;
    }

}
