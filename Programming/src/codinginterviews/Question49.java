package codinginterviews;

import java.util.ArrayList;
import java.util.Scanner;

public class Question49 {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        System.out.println(GetUglyNumber_Solution(index));
    }

    public static int GetUglyNumber_Solution(int index) {
        if(index<=0)
            return 0;
        ArrayList<Integer> uglyArray = new ArrayList<Integer>();
        uglyArray.add(1);
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int currentIndex =1;
        while(currentIndex<index){
            int min  = minInThree(uglyArray.get(index2)*2,uglyArray.get(index3)*3,uglyArray.get(index5)*5);
            uglyArray.add(min);
            while (uglyArray.get(index2)*2<=min){
                index2++;
            }
            while (uglyArray.get(index3)*3<=min){
                index3++;
            }
            while (uglyArray.get(index5)*5<=min){
                index5++;
            }
            currentIndex++;
        }
        return uglyArray.get(uglyArray.size()-1);
    }
    public static int minInThree(int a,int b,int c){
        int min;
        min = Math.min(a,b);
        min = Math.min(min,c);
        return min;
    }
}
