package codinginterviews;

import com.mysql.cj.util.StringUtils;
import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Question38 {
    public ArrayList<String> Permutation(String str) {
        String []strArr = str.split("");
        Arrays.sort(strArr);
        StringBuilder strB = new StringBuilder("");
        for(int i =0;i<strArr.length;++i){
            strB.append(strArr[i]);
        }
        return null;
    }
    public ArrayList<String> Permutation1(String str) {
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
            ArrayList<String> subResult = Permutation1(subStr);
            for(int j =0;j<subResult.size();++j){
                result.add(currentStr+subResult.get(j));
            }
        }
        return result;
    }
    public String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
