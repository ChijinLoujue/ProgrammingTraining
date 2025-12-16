import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LeetCode17 {
    public static void main(String[] args) {
        LeetCode17 solution = new LeetCode17();
        System.out.println(solution.letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        char[][] letterArray = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
                { 'g', 'h', 'i' },
                { 'j', 'k', 'l' },
                { 'm', 'n', 'o' },
                { 'p', 'q', 'r', 's' },
                { 't', 'u', 'v' },
                { 'w', 'x', 'y', 'z' } };
        List<String> result = new ArrayList<String>();
        char[] digitCharArray = digits.toCharArray();
        int len = digitCharArray.length;
        int[] numArray = new int[len];
        int size = 1;
        for (int i = 0; i < len; i++) {
            numArray[i] = digitCharArray[i] - '0';
            size = size * numArray[i];
        }

        List<StringBuffer> buffers = new ArrayList<StringBuffer>(0);
        for (int i = 0; i < len; i++) {
            buffers = getNextStringBufferList(buffers, letterArray[numArray[i]]);
        }
        result = buffers.stream()
                .map(StringBuffer::toString)
                .collect(Collectors.toList());
        return result;
    }

    List<StringBuffer> getNextStringBufferList(List<StringBuffer> currentStringBufferList, char[] newCharArray) {
        if (currentStringBufferList == null || currentStringBufferList.isEmpty()) {
            currentStringBufferList = new ArrayList<>();
            currentStringBufferList.add(new StringBuffer(""));
        }
        int beforeSize = currentStringBufferList.size();
        int charLen = newCharArray.length;
        List<StringBuffer> newStringBuffers = new ArrayList<>(beforeSize * charLen);
        for (int i = 0; i < beforeSize; i++) {
            for (int j = 0; j < charLen; j++) {
                StringBuffer cloneStringBuffer = new StringBuffer(currentStringBufferList.get(i));
                newStringBuffers.add(cloneStringBuffer.append(newCharArray[j]));
            }
        }
        return newStringBuffers;
    }
}
