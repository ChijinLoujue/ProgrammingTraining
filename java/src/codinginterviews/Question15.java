package codinginterviews;

import java.util.Scanner;

public class Question15 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(NumberOf1(n));
    }

    public static int NumberOf1(int n) {
        int result =0;
        while (n !=0){
            n=n&(n-1);
            ++result;
        }
        return result;
    }

}
