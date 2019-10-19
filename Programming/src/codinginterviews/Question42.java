package codinginterviews;

public class Question42 {
    public int FindGreatestSumOfSubArray1(int[] array) {

        if(array.length<=1)
            return array[0];
        int currentSum = 0;
        int currentSumMax = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;++i){
            if(currentSum<=0){
                currentSum = array[i];
            }else {
                currentSum +=array[i];
            }
            if(currentSum>currentSumMax)
                currentSumMax =currentSum;
        }
        return currentSumMax;
    }

    public int FindGreatestSumOfSubArray(int[] array) {

        if(array.length<=1)
            return array[0];
        int currentSum = 0;
        int currentSumMax = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;++i){
            if(currentSum<=0){
                currentSum = array[i];
            }else {
                currentSum +=array[i];
            }
            if(currentSum>currentSumMax)
                currentSumMax =currentSum;
        }
        return currentSumMax;
    }

}
