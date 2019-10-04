package codinginterviews;

import java.util.Scanner;

public class Question21 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String []str = input.split(" ");
        int []array = new int[str.length];
        for(int i = 0;i<str.length;++i){
            array[i] = Integer.parseInt(str[i]);
        }
        reOrderArray(array);
        System.out.println(array);
    }
    public static void reOrderArray(int [] array) {
        int len = array.length;
        int [] oddArray = new int[len];
        int oddIndex =0;
        int [] evenArray = new int[len];
        int evenIndex =0;
        for(int i = 0;i<len;++i){
            if(array[i]%2==0){
                evenArray[evenIndex]=array[i];
                evenIndex++;
            }else {
                oddArray[oddIndex]=array[i];
                oddIndex++;
            }
        }
        for(int i = 0;i<oddIndex;++i){
            array[i] = oddArray[i];
        }
        for(int i = 0;i<evenIndex;++i){
            array[oddIndex+i] = evenArray[i];
        }
    }
}
