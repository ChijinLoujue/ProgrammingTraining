
//LeetCode4: 时间复杂度O(log(m+n))下得到两个排序数组的中位数
import java.util.Scanner;

public class LeetCode4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer m = sc.nextInt();
        Integer n = sc.nextInt();
        Integer []input1 = new Integer[m];
        Integer []input2 = new Integer[n];
        for(int i=0;i<m;++i){
            input1[i] = sc.nextInt();
        }
        for(int i=0;i<n;++i){
            input2[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(input1,input2));
    }
    public  static double findMedianSortedArrays(Integer[] nums1,Integer[]nums2){
        int len1 = nums1.length;
        int len2 = nums2.length;
        int lendata = len1+len2;
        Integer []data = new Integer[lendata];
        int m=0,n=0;
        while (m<len1||n<len2){
            if(m<len1&&(n>=len2||nums1[m]<nums2[n])){
                data[m+n] = nums1[m];
                ++m;
            }else{
                data[m+n] = nums2[n];
                ++n;
            }
        }
        if((lendata)%2==0){
            return (double)(data[lendata/2]+data[lendata/2-1])/2;
        }else {
            return data[(lendata-1)/2];
        }
    }
}