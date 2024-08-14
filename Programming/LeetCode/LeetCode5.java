
//LeetCode5: 最大回文字符串
import java.util.Scanner;

public class LeetCode5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        Integer maxLength = 0;
        int left = 0;
        int right =0;
        Integer[][] x = new int[s.length()][s.length()];
        for(int n = 0;n<s.length();n++){
            for(int i = 0;i+n<s.length();i++){
                Integer x = huiwenlong( s,  i,  i+n, x);
                if(x>maxLength){
                    maxLength = x;
                    left= i;
                    right = i+n+1;
                }
            }
        }
        return s.subString(left,right);
    }
    private Integer huiwenlong(String s, int i, int j, int[][] x){
        if(i==j){
            x[i][j]=1;
        }
        if(s.charAt(i)==s.charAt(j)){
            x[i][j] = x[i+1][j-1]+2;
        }else{
            x[i][j] = x[i+1][j-1];
        }
        return x[i][j];
    }

}