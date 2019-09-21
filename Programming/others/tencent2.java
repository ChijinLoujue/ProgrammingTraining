//// 本题为考试多行输入输出规范示例，无需提交，不计分。
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int i = 0; i < t; i++){
//            int n = sc.nextInt();
//            String input = sc.next();
//            if(n<11){
//                System.out.println("NO");
//                continue;
//            }
//            int num8 = input.indexOf('8');
//            if(num8<0){
//                System.out.println("NO");
//                continue;
//            }
//            if(n-num8>=10){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//        }
//
//    }
//}

//// 本题为考试多行输入输出规范示例，无需提交，不计分。
//import java.util.Scanner;
//
//public class Main {
//    private static int g_minval = 20*1000+1;
//
//    public  static  void get_minval(int[][] m,int n,int b,int j,int minval){
//        if(b==n){
//            if(g_minval>minval) g_minval = minval;
//        }else {
//            for(int i = 0;i<3;i++){
//                if(i==j) continue;
//                minval +=m[b][i];
//                get_minval(m,n,b+1,i,minval);
//                minval -= m[b][i];
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] array = new int[n][3];
//        for (int i = 0; i < 3 * n; i++) {
//            array[i / 3][i % 3] = sc.nextInt();
//        }
//        get_minval(array,n,0,0,0);
//         System.out.println(g_minval);
//    }
//}
//
//// 本题为考试多行输入输出规范示例，无需提交，不计分。
//import java.util.Scanner;
//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] data = new int [n];
//        for(int i = 0; i < n; i++){
//            data[i] = sc.nextInt();
//        }
//        Arrays.sort(data);
//        boolean flag =( n%2 ==0);
//        for(int i = 0; i < n; i = i+2){
//            System.out.print(data[i]);
//            System.out.println(" ");
//        }
//        for(int i = n-(flag? 1:2); i >=0; i = i-2){
//            System.out.print(data[i]);
//            if(i-2>=0)
//            System.out.println(" ");
//        }
//    }
//}
// 本题为考试多行输入输出规范示例，无需提交，不计分。
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []data = new int[n];
//        int firstMin = Integer.MAX_VALUE;
//        for(int i = 0; i < n; i++){
//            data[i] = sc.nextInt();
//            if(data[i] <= firstMin){
//                firstMin = data[i];
//            }
//        }
//        int times = 0;
//        while (true){
//            int min =Integer.MAX_VALUE;
//            int start =0;
//            int pre = 1;
//            boolean breakFlag = true;
//            boolean clearFlag = false;
//            boolean recordFlag = false;
//            for(int i=0;i<n;i++){
//                int val = data[i];
//                if(val >0){
//                    breakFlag = false;
//                    if(val<=min){
//                        min =val;
//                    }
//                    if(pre<=0){
//                        start =i;
//                    }
//                    clearFlag =false;
//                    recordFlag = true;
//                }else {
//                    clearFlag =true;
//                    if(recordFlag){
//                        times+=min;
//                        for(int j=start;j<=i;j++){
//                            data[j] = data[j]-min;
//                        }
//                    }
//                    recordFlag =false;
//                }
//                pre =val;
//            }
//            if(!clearFlag && recordFlag){
//                times+=min;
//                for(int i=start;i<n;i++){
//                    data[i] = data[i]-min;
//                }
//            }
//            if(breakFlag){
//                break;
//            }
//        }
//        System.out.println(times);
//    }
//}
