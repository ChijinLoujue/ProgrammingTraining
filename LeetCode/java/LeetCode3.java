//寻找最大不重复子字符串

import java.util.Scanner;

public class LeetCode3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int curLength = 0;      //当前子字符串长度
        int maxLength = 0;       //最大子字符串长度
        int []position = new int [127];    //设置前一个字符的下标
        for(int i=0;i<127;++i){
            position[i] = -1;         //将数组初始化为-1
        }
        for(int i=0;i<s.length();++i){    //从头遍历某字符串 ，第i个字符时
            int prevIndex = position[s.charAt(i)];            //将该字符的上一次下标给preIndex
            if(prevIndex<0||i-prevIndex>curLength){        //如果pre<0（之前没出现过）或者当前下标和上次下标插值比当前子字符串长度还大
                ++curLength;                                //那就让当前子字符串加1
            }else{                                          //否则
                if(curLength>maxLength){                    //如果当前子字符串大于之前统计的最大子字符串
                    maxLength=curLength;                    //就设置当前子字符串长度为最大
                }
                curLength = i-prevIndex;                     //当前子字符串长度为当前遍历的字符下标-上次的下标
            }
            position[s.charAt(i)] = i;              //在遍历下一个字符前先把这个字符存到

        }
        if(curLength>maxLength){
            maxLength = curLength;
        }

        return maxLength;
    }

}
