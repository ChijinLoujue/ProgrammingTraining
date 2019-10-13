package codinginterviews;

import java.util.Arrays;
import java.util.Scanner;

public class Question33 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String []strArr = str.split(" ");
        int len = strArr.length;
        int []postorder = new int[len];
        for(int i = 0;i<len;++i){
            postorder[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(VerifySquenceOfBST(postorder));
    }

    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null)
            return false;
        int len = sequence.length;
        if(len<=0)
            return false;
        if(len<=2)
            return true;
        int root = sequence[len-1];
        int leftlen=0;
        int i=0;
        for(;i<len-1;++i){
            if(sequence[i]>root){
                break;
            }
        }
        leftlen=i;
        int rightlen = len-1-leftlen;
        for(;i<len-1;++i){
            if(sequence[i]<root)
                return false;
        }
        boolean left =true;
        if(leftlen>0){
            int []leftArray = Arrays.copyOfRange(sequence,0,leftlen);
            left = VerifySquenceOfBST(leftArray);
        }
        boolean right = true;
        if(rightlen>0){
            int []rightArray = Arrays.copyOfRange(sequence,leftlen,len-1);
            right=VerifySquenceOfBST(rightArray);
        }
        return left&&right;

    }

}
