package codinginterviews;

import java.util.ArrayList;
import java.util.Scanner;

public class Question57 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(FindContinuousSequence(n));
        }
    }
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>>  result = new ArrayList<ArrayList<Integer>>();
        if(sum<2)
            return result;
        int first = 1;
        int end = 2;
        while (first<end) {
            int index = first;
            int currentSum = 0;
            while (index <= end) {
                currentSum += index;
                index++;
            }
            if (currentSum == sum) {
                ArrayList<Integer> currentResult = new ArrayList<Integer>();
                for (int i = first; i <= end; ++i) {
                    currentResult.add(i);
                }
                result.add(currentResult);
            }
            if (currentSum > sum) {
                first++;
            } else {
                end++;
            }
        }
        return result;
    }
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int first = 0;
        int end = array.length-1;
        boolean hasResult = false;
        while (first<end){
            int currenSum = array[first]+array[end];
            if(currenSum==sum){
                hasResult = true;
                break;
            }else if(currenSum>sum){
                end--;
            }else {
                first++;
            }
        }
        if(hasResult){
            result.add(array[first]);
            result.add(array[end]);
        }

        return result;

    }
}
