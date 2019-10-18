package codinginterviews;

import java.util.HashMap;

public class Question39 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        int len = array.length;
        if(len==0)
            return 0;
        if(len<=2)
            return array[0];
        for(int i = 0;i<len;++i){
            if(myMap.containsKey(array[i])){
                if(myMap.get(array[i])<=len/2){
                    myMap.put(array[i],myMap.get(array[i])+1);
                    if(myMap.get(array[i])>len/2)
                        return array[i];
                }
            }else {
                myMap.put(array[i],1);
            }
        }
        return 0;
    }
}
