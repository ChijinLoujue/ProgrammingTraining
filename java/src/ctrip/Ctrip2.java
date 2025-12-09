package ctrip;

import java.util.ArrayList;
import java.util.Scanner;

public class Ctrip2 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listNum =new ArrayList<Integer>();
        while (in.hasNext()){
            String input = in.nextLine();
            String []inputArr = input.split(" ");
            Integer currentNum = Integer.parseInt(inputArr[1]);
            if(inputArr[0].equals("offer")){
                if(listNum.isEmpty()){
                    listNum.add(currentNum);
                }else{
                    int Index=0;
                    while (Index<listNum.size()&&currentNum>listNum.get(Index))
                        Index++;
                    listNum.add(Index,currentNum);
                }
            }
            if(inputArr[0].equals("poll")){
                for(int i =0;i<currentNum;++i){
                    if(listNum.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(listNum.get(0));
                        listNum.remove(0);
                    }
                }
            }
        }

    }
}
/*
offer 5
offer 1
poll 1
offer 2
offer 10
poll 3
offer 24
poll 2


*/