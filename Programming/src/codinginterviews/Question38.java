package codinginterviews;

import java.util.ArrayList;
import java.util.Scanner;

public class Question38 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        ArrayList<String> strArr = Permutation(str);
        for(int i = 0;i<strArr.size();++i){
            System.out.print(strArr.get(i)+" ");
        }
        System.out.println();
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();
        if(str.length()==0)
            return result;
        if(str.length()==1){
            result.add(str);
            return result;
        }
        for(int i =0;i<str.length();++i){
            String subStr = removeCharAt(str,i);
            String currentStr = String.valueOf(str.charAt(i));
            if(i>0)
                if(currentStr.equals(String.valueOf(str.charAt(i-1))))
                    continue;
            ArrayList<String> subResult = Permutation(subStr);
            for(int j =0;j<subResult.size();++j){
                result.add(currentStr+subResult.get(j));
            }
        }
        return result;
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

//
//    public ArrayList<String> Permutation1(String str) {
//        String []strArr = str.split("");
//        Arrays.sort(strArr);
//        StringBuilder strB = new StringBuilder("");
//        for(int i =0;i<strArr.length;++i){
//            strB.append(strArr[i]);
//        }
//        return null;
//    }
}
