package codinginterviews;

import java.util.Arrays;

public class Question61 {
    public boolean isContinuous(int [] numbers) {
        int len = numbers.length;
        if(len!=5)
            return false;
        Arrays.sort(numbers);
        int numberOfZero = 0;
        for(int i = 0;i<len;++i){
            if(numbers[i]==0)
                numberOfZero++;
        }
        for(int i=numberOfZero;i<len-1;++i){
            if(numbers[i+1]==numbers[i])
                return false;
        }

        int needZero = 0;
        for(int i=numberOfZero;i<len-1;++i){
            needZero += numbers[i+1]-numbers[i]-1;
        }
        return (needZero<=numberOfZero);
    }

}
