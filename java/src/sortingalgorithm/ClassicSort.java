package sortingalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ClassicSort {
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
        bubbleSort(array);
        bubbleSort(randomArray);
        for(int i=0;i<len;++i){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0;i<randomLen;++i){
            System.out.print(randomArray[i]+" ");
        }
        //int []array1 = mergeSort(array);
        //int []randomArray1 = mergeSort(randomArray);
//        for(int i=0;i<len;++i){
//            System.out.print(array1[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<randomLen;++i){
//            System.out.print(randomArray1[i]+" ");
//        }
    }
    // 冒泡排序
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
    //选择排序
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
  //插入排序
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
    //希尔排序
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
    //并归排序
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
   //快速排序
    public static void quickSort(int []array,int firstIndex,int endIndex){
        int len = endIndex-firstIndex+1;
        if(len>=2){
            int k = array[firstIndex];
            int leftIndex = firstIndex;
            int rightIndex = endIndex;
            while (leftIndex<rightIndex) {
                while ((leftIndex < rightIndex) && array[rightIndex] >= k)
                    rightIndex--;
                while ((leftIndex < rightIndex) && array[leftIndex] <= k)
                    leftIndex++;
                if(leftIndex < rightIndex){
                    int temp = array[leftIndex];
                    array[leftIndex] = array[rightIndex];
                    array[rightIndex] = temp;
                }
            }
            if(leftIndex==rightIndex){
                int temp = array[firstIndex];
                array[firstIndex] = array[rightIndex];
                array[rightIndex] = temp;
            }
            quickSort(array,firstIndex,leftIndex-1);
            quickSort(array,rightIndex+1,endIndex);
        }
    }
    //堆排序
    public static void heapSort(int []array){
        buildMaxHeap(array);
        int len = array.length;
        for(int i = len-1;i>0;--i){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            len--;
            heapify(array,0,len);
        }
    }
    public static void buildMaxHeap(int []array){
        int len = array.length;
        for(int i = len/2;i>=0;--i) {
            heapify(array, i,len);
        }
    }
    public static void heapify(int []array,int i,int len){
        int leftIndex = 2*i+1;
        int rightIndex = 2*i+2;
        int largeIndex = i;
        if(leftIndex<len&&array[leftIndex]>array[largeIndex]){
            largeIndex = leftIndex;
        }
        if(rightIndex<len&&array[rightIndex]>array[largeIndex]){
            largeIndex = rightIndex;
        }
        if(largeIndex!=i){
            int temp = array[i];
            array[i] = array[largeIndex];
            array[largeIndex] = temp;
            heapify(array,largeIndex,len);
        }
    }
   //计数排序
    public static void countingSort(int []array){
        int len = array.length;
        int max = array[0];
        for(int i = 0;i<len;++i){
            if(array[i]>max)
                max = array[i];
        }
        int []cointArray = new int[max+1];
        for(int i =0;i<max+1;++i){
            cointArray[i]=0;
        }
        for(int i =0;i<len;++i){
            cointArray[array[i]]++;
        }
        int index = 0;
        for (int i=0;i<max+1;++i){
            while (cointArray[i]>0){
                array[index++] = i;
                cointArray[i]--;
            }
        }
    }
    //桶式排序
    public static void bucketSort(int []array,int bucketSize){
        int len = array.length;
        if(len>=2){
            int maxValue = array[0];
            int minValue = array[0];
            for(int i = 1;i<len;++i){
                if(array[i]<minValue){
                    minValue = array[i];
                }else if(array[i]>maxValue){
                    maxValue = array[i];
                }
            }

            if(bucketSize <=0) bucketSize = 1;
            int bucketCount = (maxValue-minValue)/bucketSize+1;
            int [][]buckets = new int[bucketCount][0];

            for(int i = 0;i<len;++i){
                int bucketIndex = (array[i]-minValue)/bucketSize;
                int bucketLen = buckets[bucketIndex].length;
                buckets[bucketIndex] =Arrays.copyOf(buckets[bucketIndex],bucketLen+1);
                buckets[bucketIndex][bucketLen] = array[i];
            }
            int arrIndex = 0;
            for(int i = 0;i<bucketCount;++i){
                int bucketLen = buckets[i].length;
                if(bucketLen>=2){
                    Arrays.sort(buckets[i]);
                }
                for(int j = 0;j<bucketLen;++j){
                    array[arrIndex++] = buckets[i][j];
                }
            }
        }
    }
    //基数排序
    public static void radixSort(int []array){
        int len = array.length;
        int maxValue = getMaxValue(array);
        int maxLen = getNumLen(maxValue);
        int DEV = 1;
        int MOD = 10;
        for(int i = 0;i<maxLen;++i,DEV *=10,MOD *=10){
            int [][]buckets = new int[MOD*2][0];
            for(int j = 0;j<len;++j){
                int bucketIndex = (array[j]%MOD/DEV)+MOD;
                buckets[bucketIndex] = arrayAppend(buckets[bucketIndex],array[j]);
            }
            int arrIndex =0;
            for(int j = 0;j<MOD*2;++j){
                for (int k =0;k<buckets[j].length;++k){
                    array[arrIndex++] = buckets[j][k];
                }
            }
        }
    }
    public static int getMaxValue(int []array){
        int maxValue = array[0];
        for(int i = 0;i<array.length;++i){
            if(array[i]>maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int getNumLen(int num) {
        int len = 0;
        if(num==0)
            return 1;
        while (num!=0){
            num /=10;
            len++;
        }
        return len;
    }
    public static int []arrayAppend(int []array,int value){
        int len =array.length;
        array = Arrays.copyOf(array,len+1);
        array[len] = value;
        return array;
    }
}
//1 2 4 5 6 3 8 9 7
//4 3 2 1 5 6 7
//8 7 6 5 4 3 2 1