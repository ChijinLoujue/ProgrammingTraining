import java.util.List;
import java.util.ArrayList;

class LeetCode6 {
    
    public String convert(String s, int numRows) {
        List<StringBuffer> stringBufferList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            stringBufferList.add(new StringBuffer());
        }
        boolean up = true;
        int current = 0;
        for(int i =0;i<s.length();){
            stringBufferList.get(current).append(s.charAt(i));
            i++;
            if(i%numRows==0){
                up = !up;
            }
            if(up){
                current++;
            }else{
                current--;
            }
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            result.append(stringBufferList.get(i));
        }
        return result.toString();
    }
}