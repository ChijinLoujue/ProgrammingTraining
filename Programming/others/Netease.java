import java.math.BigInteger;
import java.util.Scanner;

public class wangyi {
}

// 第一题。
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        long []x = new long[n];
//        //long []k = new long[m];
//        for(int i = 0; i < n; i++){
//            x[i] = sc.nextLong();
//        }
//        for(int i = 0; i < m; i++){
//            long k = sc.nextLong();
//            int counter = 0;
//            for(int j =0;j<n;j++){
//                if(x[j]==k){
//                    counter++;
//                }
//            }
//            System.out.println(counter);
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []x = new int[n];
//        int []h = new int[500000000];
//        for(int i = 0; i < n; i++){
//            int val = sc.nextInt();
//            h[val]++;
//        }
//        for(int i = 0; i < m; i++){
//            int k = sc.nextInt();
//            System.out.println(h[k]);
//        }
//    }
//}


// 本题第二题
//import java.math.BigInteger;
//        import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int t=0;t<T;t++) {
//            int n = sc.nextInt();
//
//            BigInteger m = BigInteger.valueOf(sc.nextLong());
//            BigInteger[] h = new BigInteger[n];
//            for (int i = 0; i < n; i++) {
//                h[i] = BigInteger.valueOf(sc.nextLong());
//            }
//            if(n==1){
//                System.out.println("YES");
//                continue;
//            }
//            int i = 0;
//            for (; i < n; i++) {
//                BigInteger I = BigInteger.valueOf(i);
//                if (h[i].add(m).compareTo(I) > 0) {
//                    m = m.add(h[i]).subtract(I);
//                }
//                if (h[i].add(m).compareTo(I) < 0) {
//                    System.out.println("NO");
//                    break;
//                }
//            }
//            if (i == n) {
//                System.out.println("YES");
//            }
//        }
//    }
//}