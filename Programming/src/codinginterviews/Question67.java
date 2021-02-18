package codinginterviews;

public class Question67 {
    public int StrToInt(String str) {

        int len = str.length();
        if(len == 0)
            return 0;
        int []intArr = new int[len];
        boolean isFu = false;
        if(str.charAt(0)<='9'&&str.charAt(0)>='0'){
            intArr[0]=str.charAt(0)-'0';
        }else if(str.charAt(0)=='-'){
            isFu = true;
            intArr[0]=0;
        }else if(str.charAt(0)=='+'){
            intArr[0]=0;
        }else return 0;

        for(int i = 1;i<len;++i){
            char thisChar = str.charAt(i);
            if(thisChar<='9'&&thisChar>='0'){
                intArr[i]=thisChar-'0';
            }
            else return 0;
        }

        long result = 0;
        for(int i = 0;i<len;++i){
            result += intArr[i]*Math.pow(10,len-1-i);
        }

        if(isFu) result = -result;
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) return 0;
        return (int)result;
    }
}
