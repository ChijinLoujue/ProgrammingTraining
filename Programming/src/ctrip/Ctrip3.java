package ctrip;

import java.util.Scanner;

public class Ctrip3 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String finite;
        int fenzi2 =0;
        int fenmu2 =1;

        int idOfKuo = s.indexOf("(");
        if(idOfKuo != -1){
            String infinite = s.substring(idOfKuo+1,s.indexOf(")"));
            finite = s.substring(0,idOfKuo);

            fenzi2 = Integer.parseInt(infinite);
            fenmu2 = Integer.parseInt("999999999999999999".substring(0,infinite.length()));

            int maxNum = maxGongyue(fenzi2,fenmu2);

            fenzi2 /=maxNum;
            fenmu2 /=maxNum;
            fenmu2 *= Integer.parseInt("1000000000000000".substring(0,idOfKuo-finite.indexOf(".")));
        }else {
            finite =s;
        }
        String temp = finite.substring(0,finite.indexOf("."))+finite.substring(finite.indexOf(".")+1);

        int fenzi1 = Integer.parseInt(temp);
        int fenmu1 = Integer.parseInt("1000000000000000".substring(0,finite.length()-finite.indexOf(".")));

        int maxNum = maxGongyue(fenzi1,fenmu1);

        fenzi1 /= maxNum;
        fenmu1 /= maxNum;

        maxNum = maxGongyue(fenmu1,fenmu2);
        int fenmu = fenmu1*fenmu2/maxNum;
        int fenzi = fenzi1*(fenmu/fenmu1)+fenzi2*(fenmu/fenmu2);

        maxNum = maxGongyue(fenzi,fenmu);

        fenzi /= maxNum;
        fenmu /= maxNum;

        if(fenmu==1){
            System.out.println(fenzi);
        }else {
            System.out.println(fenzi+"/"+fenmu);
        }
    }

    public static int maxGongyue(int a,int b){
        int value = 1;
        for(int i =2;i<=a;++i){
            if(a%i==0&&b%i==0){
                value *= i;
                a /= i;
                b /= i;
            }
        }
        return  value;
    }

}
