package huawei;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.nextLine();
            int n = sc.nextInt();
            String []strArr = input.split("-");
            int NumArr = strArr.length;
            String NewStr = "";
            for(int i = 0;i<NumArr;++i){
                strArr[i] = deleteCharinStr(strArr[i],n);
                NewStr += strArr[i];
            }
            System.out.println(NewStr);
        }
    }
    public static String deleteCharinStr(String str,int n){
        int len = str.length();
        if(n>=len)
            return str;
        return str.substring(0,n)+str.substring(n+1,len);

    }
}
