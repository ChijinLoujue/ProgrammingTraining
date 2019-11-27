package codinginterviews;

import java.util.Scanner;

public class QuestionTest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int

        System.out.println(changeX(x));
    }
    public static int changeX(String str){

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
        if(isFu) result = 0-result;
        int xx = (int)result;
        return xx;
    }

}
/*
-2147483649
-2147483648

package codinginterviews;

import java.util.Scanner;

public class QuestionTest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int

        System.out.println(changeX(x));
    }
    public static int changeX(String str){

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
        if(isFu) result = 0-result;
        int xx = (int)result;
        return xx;






 */
