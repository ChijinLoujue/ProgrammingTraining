package codinginterviews;

import java.util.Scanner;

public class Question5 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer str = new StringBuffer(input);
        System.out.println(replaceSpace(str));
    }
    public static String replaceSpace(StringBuffer str) {
        for(int i=str.length()-1;i>=0;--i){
            if(str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();

    }
}
