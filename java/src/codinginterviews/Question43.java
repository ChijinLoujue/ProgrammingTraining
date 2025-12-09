package codinginterviews;

import java.util.Scanner;

public class Question43 {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(NumberOf1Between1AndN_Solution(n));
        }
    }

    public static int NumberOf1Between1AndN_Solution1(int n) {
        if(n<=0)
            return 0;
        int countofOne = 0;
        for(int currentNum = 0;currentNum<=n;currentNum++){
            String  current = String.valueOf(currentNum);
            char []currentChar = current.toCharArray();
            for(int i = 0;i<currentChar.length;++i){
                if(currentChar[i]=='1')
                    countofOne++;
            }
        }
        return countofOne;
    }
     //错误思路
    public static int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0)
            return 0;
        int countofOne = 0;
        if(n<10)
            return 1;
        //找到最高位 和剩余数
        String  nStr = String.valueOf(n);
        char []nChar = nStr.toCharArray();
        int nLen = nChar.length;
        int first = nChar[0]-'0';
        int other = n%(int)(Math.pow(10,nLen-1));
        int otherCount = NumberOf1Between1AndN_Solution(other);

        int baseC = (nLen-1)*(int)Math.pow(10,nLen-2);
        int firstCount = 0;
        if(first==1){
            firstCount =baseC+1;
            countofOne = firstCount+baseC+otherCount;
        }else{

        }

        return countofOne;
    }


}
