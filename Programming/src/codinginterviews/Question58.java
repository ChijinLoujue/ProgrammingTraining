package codinginterviews;

public class Question58 {
    public String LeftRotateString(String str,int n) {
        if(n>=str.length())
            return str;
        String beforeStr = str.substring(0,n);
        String afterStr = str.substring(n);
        return afterStr+beforeStr;
    }
    public String ReverseSentence(String str) {
        String []strArr = str.split(" ");
        StringBuilder newStr = new StringBuilder("");
        if(strArr.length<=0)
            return str;
        for(int i = strArr.length-1;i>0;--i){
            newStr.append(strArr[i]).append(" ");
        }
        newStr.append(strArr[0]);
        return newStr.toString();
    }

}
