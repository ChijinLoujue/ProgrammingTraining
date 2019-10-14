package ctrip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Ctrip1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String []nodeArr = input.split("],");
        int len = nodeArr.length;
        ArrayList<ArrayList<Character>> nodeAll = new ArrayList<ArrayList<Character>>();
        int maxLen =0;
        for(int i = 0;i<len;++i){
            int currentLen = nodeArr.length;
            ArrayList<Character> currentArr = new ArrayList<Character>();
            for(int j=0;j<currentLen;++j){
                if(nodeArr[i].charAt(j)<='Z'&&nodeArr[i].charAt(j)>='A'){
                    currentArr.add(nodeArr[i].charAt(j));
                }
            }
            if(currentArr.size()>maxLen)
                maxLen=currentArr.size();
            nodeAll.add(new ArrayList<Character>(currentArr));
        }
        ArrayList<Character> result = new ArrayList<Character>();

    }
}
