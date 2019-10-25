package codinginterviews;

import java.util.Scanner;

public class Question45 {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String []inputArr = input.split(" ");
        int len =inputArr.length;
        int []numbers = new int[len];
        for(int i = 0;i<len;++i){
            numbers[i] = Integer.parseInt(inputArr[i]);
        }
        System.out.println(PrintMinNumber(numbers));
        //3334 3 3333332
    }
    public static String PrintMinNumber(int [] numbers) {
        int len = numbers.length;
        for(int i =0;i<len-1;++i){
            for(int j=0;j<len-1-i;++j){
                if(compare(numbers[j],numbers[j+1])>0){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        StringBuilder result = new StringBuilder("");
        String []numStr = new String[len];
        for(int i=0;i<len;++i){
            numStr[i] = String.valueOf(numbers[i]);
            result.append(numStr[i]);
        }
        return result.toString();
    }

    public static int compare(int x,int y){
        int compare = 0;
        if(x==y)
            return compare;
        String xStr = String.valueOf(x);
        String yStr = String.valueOf(y);
        String xyStr = xStr+yStr;
        String yxStr = yStr+xStr;
        Long xy = Long.parseLong(xyStr);
        Long yx = Long.parseLong(yxStr);
        if(xy.equals(yx))
            compare = 0;
        if(xy.compareTo(yx)>0)
            compare = 1;
        if(xy.compareTo(yx)<0)
            compare = -1;
        return compare;
    }

}
