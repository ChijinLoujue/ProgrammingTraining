import java.util.Scanner;

public class BaiduIII {
    public static void mainb(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[][] m = new int[n - 1][2];
            for (int i = 0; i < n - 1; i++) {
                m[i][0] = sc.nextInt();
                m[i][1] = sc.nextInt();
            }

            System.out.print(dosomething(1, n - 1, m) - 1 + " ");
            for (int i = 2; i < n; i++) {
                System.out.print(dosomething(i, n - 1, m) + " ");
            }
            System.out.print(dosomething(n, n - 1, m));
        }
    }
    public static int dosomething(int k,int n,int [][]m){
        int result = 0;
        for(int i=0;i<n;i++){
            if(m[i][0] == k){
                int next = m[i][1];
                int nextmax = dosomething(next,n,m);
                if(result<nextmax){
                    result=nextmax;
                }
            }

        }

        return result+1;
    }
}



//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int m = sc.nextInt();
//            int n = sc.nextInt();
//            int []dai =new int[n];
//            for(int i = 0;i<n;i++){
//                dai[i] = sc.nextInt();
//            }
//
//        }
//    }
//}
//    public static int dosomething(int n){
//        int result = 0;
//        for(int i=0;i<n;i++){
//            if(m[i][0] == k){
//                int next = m[i][1];
//                int nextmax = dosomething(next,n,m);
//                if(result<nextmax){
//                    result=nextmax;
//                }
//            }
//
//        }

//        return result+1;
//    }
//}


