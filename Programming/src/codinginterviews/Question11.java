package codinginterviews;

import java.util.Scanner;

public class Question11 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        String []strs = str.split(" ");
        int []array = new int[strs.length];
        for(int i =0;i<strs.length;++i){
            array[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(minNumberInRotateArray(array));
    }

    public static int minNumberInRotateArray(int [] array) {
        int len = array.length;
        int index1 = 0;
        int index2 = len-1;
        int midIndex = 0;
        while (array[index1]>=array[index2]){
            if(index2-index1==1){
                midIndex = index2;
                break;
            }
            midIndex = (index1+index2)/2;

            if(array[midIndex]==array[index1]&&array[midIndex]==array[index2]){
                midIndex = minInOder(array,index1,index2);
            }
            if(array[midIndex]>=array[index1]){
                index1 = midIndex;
            }else if(array[midIndex]<=array[index2]){
                index2 = midIndex;
            }
        }
        return array[midIndex];

    }

    public static int minInOder(int []array,int start,int end){
        int minNum = array[start];
        int minIndex =start;
        int i =start+1;
        for(;i<=end;++i){
            if(array[i]<minNum){
                minNum = array[i];
                minIndex = i;
            }
        }
        return i;
    }

}
