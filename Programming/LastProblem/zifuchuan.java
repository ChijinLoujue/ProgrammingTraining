

import java.util.Scanner;
public class zifuchuan{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String  Str = myScanner.nextLine();
        
        System.out.println(doSomething(Str));
        myScanner.close();

    }

    public static String doSomething(String Str){
        String StrRsult="";
        int StrLength = Str.length();
        for (int i=0;i<StrLength;i++){
            if(i==Str.indexOf(Str.charAt(i)))
            StrRsult = StrRsult+Str.charAt(i);
        }
        return StrRsult;
    }
}