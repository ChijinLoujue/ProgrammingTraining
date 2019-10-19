package liulishuo;

import java.util.Scanner;

public class Liulishuo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipv4 = sc.nextLine();

        System.out.println(isIpv4(ipv4));
    }
    public static boolean isIpv4(String ipv4){
        if(ipv4 ==null)
            return false;
        String []strArr = ipv4.split(".");
        int len = strArr.length;
        if(len!=4)
            return false;
        for(String numStr :strArr){
            try {
                int num = Integer.parseInt(numStr);
                if(num<0||num>255){
                    return false;
                }
            }catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }
}
