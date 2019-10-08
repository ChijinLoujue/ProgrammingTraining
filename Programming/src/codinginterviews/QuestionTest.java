package codinginterviews;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionTest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(getNumLen(m));
    }

    public static int getNumLen(int num) {
        int len = 0;

        while (num!=0){
            num /=10;
            len++;
        }
        return len;
    }
}
/*
4 4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
 */
