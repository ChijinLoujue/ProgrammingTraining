package huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> RightStr = new ArrayList<String>();
            StringBuffer RightStrB = new StringBuffer();
            StringBuffer ErroStr = new StringBuffer();
            while(sc.hasNext()){
                String str = sc.nextLine();
                if(isRight(str)){
                    RightStr.add(str);
                }else {
                    ErroStr.append(str).append(" ");
                }
            }
            int rightStrLen = RightStr.size();
            for(int i = 1;i<rightStrLen;++i){
                boolean hasBeen = false;
                for(int j = 0;j<i;++j){
                    if(RightStr.get(i).equals(RightStr.get(j)))
                        hasBeen = true;
                }
                if(hasBeen==true)
                    RightStr.set(i,"");
            }

            for(int i = 0;i<RightStr.size();++i){
                if(RightStr.get(i)!="")
                RightStrB.append(RightStr.get(i)).append(" ");
            }
            System.out.println(RightStrB.substring(0,RightStrB.length()-1));
            System.out.println(ErroStr.substring(0,ErroStr.length()-1));
        }
        public static boolean isRight(String str){
            char []strArr = str.toCharArray();
            int strLen = strArr.length;
            for(int i = 0;i<strLen;++i){
                if((strArr[i]<'0'||strArr[i]>'9')&&(strArr[i]<'a'||strArr[i]>'z')&&(strArr[i]<'A'||strArr[i]>'Z')){
                    return false;
                }
            }
            return true;
        }

}

/****
 abc
 def
 ==
 acd123
 44234tjg
 aga'-=
 ad--s
 abd
 123
 abcdef
 123456789012345678901234567890123456789012345678901234567890123
 EDFG
 SDFG
 ABC
 DEF
 cccc
 a*b=1
 abc
 cccc
 dd
 def
 87&&^
 abc
 asdfas
 234abc35
 765rgfh4sd
 1231
 123
 ==
 EDFG
 * ****/