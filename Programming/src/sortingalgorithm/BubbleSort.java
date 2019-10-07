package sortingalgorithm;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    final static int randomLen = 50;
    public static void main(String []args){
       int []randomArray = new int[randomLen];
        for(int i=0;i<randomLen;++i){
            randomArray[i]=(int)(Math.random()*randomLen);
        }
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String []arrayStr = input.split(" ");
        int len = arrayStr.length;
        int []array =new int[len];
        for(int i=0;i<len;++i){
            array[i] =Integer.parseInt(arrayStr[i]);
        }
        //shellSort(array);
        //shellSort(randomArray);
        int []array1 = mergeSort(array);
        int []randomArray1 = mergeSort(randomArray);
        for(int i=0;i<len;++i){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<randomLen;++i){
            System.out.print(randomArray1[i]+" ");
        }
    }
    public static void bubbleSort(int []array){
        int len =array.length;
        for(int i=0;i<len-1;++i){
            for(int j=0;j<len-1-i;++j){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int []array){
        int len =array.length;
        for(int i =0;i<len-1;++i){
            int minIndex =i;
            for(int j=i+1;j<len;++j){
                if(array[j]<array[minIndex]){
                    minIndex =j;
                }
            }
            int temp = array[i];
            array[i] =array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void insertionSort(int []array){
        int len =array.length;
        if(len>=2){
            int temp = array[0];
            for (int i=1;i<len;++i){
                int proIndex =i-1;
                temp = array[i];
                while (proIndex>=0&&array[proIndex]>temp){
                    array[proIndex+1]=array[proIndex];
                    --proIndex;
                }
                array[proIndex+1] = temp;
            }
        }

    }
    public static void shellSort(int []array){
        int len = array.length;
        int proIndex =0;
        int gap = len;
        while (gap>1){
            gap /= 2;
            for(int i=0;i<gap;++i){
                for(int j =i+gap;j<len;j+=gap){
                    int temp = array[j];
                    proIndex =j-gap;
                    while (proIndex>=0&&temp<array[proIndex]){
                        array[proIndex+gap] =array[proIndex];
                        proIndex -=gap;
                    }
                    array[proIndex+gap]=temp;
                }
            }
        }
    }

    public static int[] mergeSort(int []array){
        int len =array.length;
        if(len<2)
            return array;
        int len1 = len/2;
        int len2 =len-len1;
        int []array1 = Arrays.copyOfRange(array,0,len1);
        int []array2 = Arrays.copyOfRange(array,len1,len);
        return merge(mergeSort(array1),mergeSort(array2));

    }
    public static int [] merge(int []array1,int []array2){
        int len1 = array1.length;
        int len2 = array2.length;
        int len = len1+len2;
        int []result = new int[len];
        int index1 =0;
        int index2 =0;
        while (index1<len1&&index2<len2){
            if(array1[index1]<=array2[index2]){
                result[index1+index2] = array1[index1];
                ++index1;
            }else{
                result[index1+index2] = array2[index2];
                ++index2;
            }
        }
        while (index1<len1){
            result[index2+index1] = array1[index1];
            ++index1;
        }
        while (index2<len2){
            result[index1+index2] = array2[index2];
            ++index2;
        }
        return result;
    }
}
//1 2 4 5 6 3 8 9 7
//4 3 2 1 5 6 7
//8 7 6 5 4 3 2 1