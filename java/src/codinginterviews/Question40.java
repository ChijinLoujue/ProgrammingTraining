package codinginterviews;

import java.util.*;

public class Question40 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []input = new int[n];
        for(int i=0;i<n;++i){
            input[i] = in.nextInt();
        }
        int k = in.nextInt();
        ArrayList<Integer> resulet = GetLeastNumbers_Solution(input,k);

        for(int i = 0;i<resulet.size();++i){
            System.out.print(resulet.get(i)+" ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int len = input.length;
        if(k<1||len<k) return arr;

        LinkedList<Integer> link = new LinkedList<Integer>();
        link.add(input[0]);
        for(int i = 1;i<k;++i){
            int index = 0;
            while (index<link.size()&&input[i]>=link.get(index))
                index++;
            link.add(index,input[i]);
        }
        for(int i=k;i<len;++i) {
            int index = 0;
            while (index<link.size()&&input[i]>=link.get(index))
                index++;
            link.add(index,input[i]);
            link.removeLast();
        }

        arr.addAll(link);
        return arr;
    }
}
/*
8
4 5 1 6 2 7 3 8
4
 */