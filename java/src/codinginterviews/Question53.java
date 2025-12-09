package codinginterviews;

public class Question53 {
    public int GetNumberOfK(int [] array , int k) {
        int len = array.length;
        int Kindex = GetK(array,0,len-1,k);
        if(Kindex<0)
            return 0;
        return GetKCount(array,Kindex,k);
    }
    public int GetK(int [] array ,int start,int end, int k){
        int len = end-start+1;
        if(len<=0)
            return -1;
        int middle = (start+end)/2;
        if(array[middle]==k){
            return middle;
        }
        if(array[middle]>k){
            end = middle-1;
        }else {
            start = middle+1;
        }
        return GetK(array,start,end,k);
    }
    public int GetKCount(int [] array ,int Kindex, int k){
        int countK = 1;
        int before = Kindex-1;
        int after = Kindex+1;
        while (before>=0&&array[before]==k){
            countK++;
            before--;
        }
        while (after<array.length&&array[after]==k){
            countK++;
            after++;
        }
        return countK;
    }
}
