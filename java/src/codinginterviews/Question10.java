package codinginterviews;

import java.util.Scanner;

public class Question10 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
        System.out.println(JumpFloor(n));
        System.out.println(JumpFloorII(n));
        System.out.println(RectCover(n));

    }

    public static int Fibonacci(int n) {
        int first = 0;
        int second = 1;
        int result = 0;
        if(n==1)
            result=1;
        for(int i = 2;i<=n;i++){
            result = first+second;
            first = second;
            second = result;
        }
        return result;
    }

    public static int JumpFloor(int target) {
        int first = 1;
        int second = 2;
        int result =0;
        if(target<3)
            return target;
        for(int i=3;i<=target;++i){
            result = first+second;
            first = second;
            second = result;
        }
        return result;
    }

    public static int JumpFloorII(int target) {
        int result = 1;
        if(target<=1)
            return result;
        for(int i=2;i<=target;++i){
            result = result*2;
        }
        return result;
    }

    public static int RectCover(int target) {
        int first = 1;
        int second = 2;
        int result =0;
        if(target<3)
            return target;
        for(int i=3;i<=target;++i){
            result = first+second;
            first = second;
            second = result;
        }
        return result;
    }
}
