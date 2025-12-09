////20190922 vivo机试

////vivo第1题，求跳一跳最少次数
//import java.io.*;
//
///**
// * Welcome to vivo !
// */
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String inputStr = br.readLine();
//        int input[] = parseInts(inputStr.split(" "));
//        int output = solution(input);
//        System.out.println(output);
//    }
//
//    private static int[] parseInts(String[] strArr) {
//        if (strArr == null || strArr.length == 0) {
//            return new int[0];
//        }
//        int[] intArr = new int[strArr.length];
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = Integer.parseInt(strArr[i]);
//        }
//        return intArr;
//    }
//
//    private static int solution(int[] input) {
//
//        // TODO Write your code here
//        int len = input.length;
//        if(len ==0)  return -1;
//        int curtimes = 0;
//        int mintimes = len;
//        if(input[0]>=len-1){
//            return 1;
//        }
//        for(int i = 1;i<=input[0];i++){
//            int zilen = len - i;
//            int []zishuzu = new int[zilen];
//            for(int j = 0;j<zilen;j++){
//                zishuzu[j] = input[j+i];
//            }
//            int cur = solution(zishuzu);
//            if(cur<0){
//                continue;
//            }else{
//                if(cur<mintimes){
//                    mintimes = cur;
//                }
//            }
//        }
//        if(mintimes==len){
//            return -1;
//        }else{
//            return mintimes+1;
//        }
//    }
//}


////vivo第二题，围圈定矩除人
//import java.io.*;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * Welcome to vivo !
// */
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String inputStr = br.readLine();
//        int input[] = parseInts(inputStr.split(" "));
//        String output = solution(input);
//        System.out.println(output);
//    }
//
//    private static int[] parseInts(String[] strArr) {
//        if (strArr == null || strArr.length == 0) {
//            return new int[0];
//        }
//        int[] intArr = new int[strArr.length];
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = Integer.parseInt(strArr[i]);
//        }
//        return intArr;
//    }
//
//    private static String solution(int[] input) {
//
//        // TODO Write your code here
//        String back ="";
//
//        List<Integer> inLine = new LinkedList<>();
//        for(int i=1;i<=input[0];i++)  inLine.add(i);
//
//        Iterator<Integer> it = inLine.iterator();
//
//        int count = 0;
//
//        while(inLine.size()!=0){
//            if(!it.hasNext()){
//                it=inLine.iterator();
//            }
//            int current = it.next();
//            if((++count)%input[1]==0){
//                it.remove();
//                back = back+current+" ";
//            }
//        }
//        back = back.substring(0,back.length()-1);
//        return back;
//    }
//
//}
