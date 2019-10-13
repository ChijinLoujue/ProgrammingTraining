//package test;
//
//import java.util.Scanner;
//
//public class Test {
//   public static void main(String []args){
//       Scanner in = new Scanner(System.in);
//       String input = in.nextLine();
//       String []inp = input.split(" ");
//       String []num = inp[0].split(",");
//       int max = Integer.parseInt(inp[1]);
//       int len = num.length;
//       int []numb = new int[len];
//       for(int i = 0;i<len;++i){
//           numb[i] = Integer.parseInt(num[i]);
//       }
//       System.out.println(numb,max);
//   }
//   public static int findposition(int []Array,int n){
//       int len = Array.length;
//       if(n>len)
//           return len-1;
//       int max = Array[0];
//       for(int i=0;i<len;++i){
//           if(Array[i]>max){
//               max=Array[i];
//           }
//       }
//
//       int result =0;
//       for(int i=0;i<n;++i){
//           int min =Array[0];
//           int minIndex = 0;
//           for(int j = 0;j<len;j++){
//               if(Array[i]<min){
//                   min = Array[i];
//                   minIndex =i;
//               }
//           }
//           Array[minIndex]=max+1;
//           result = minIndex;
//       }
//       return result;
//   }
//}
package test;

import codinginterviews.TreeNode;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rootnub = in.nextInt();
        TreeNode root = new TreeNode(rootnub);
        while (in.hasNextInt()) {
            int temp = in.nextInt();
            TreeNode tempNode = new TreeNode(temp);

        }
    }
    public static void BuildTree(TreeNode root,TreeNode tempNode){
        if(tempNode.val>root.val){
            if(root.rightNode==null){
                root.rightNode = tempNode;
            }
            if(root.rightNode.val<tempNode.val)
            if(root.rightNode.val>tempNode.val){

            }
        }
    }
    public static class TreeNode{
        int val;
        public TreeNode(int i){
            this.val = i;
        }
        TreeNode leftNode;
        TreeNode rightNode;
    }
}