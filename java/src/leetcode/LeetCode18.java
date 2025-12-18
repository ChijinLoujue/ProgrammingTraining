import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode18 {

    public static void main(String[] args) {
        LeetCode18 solution = new LeetCode18();
        System.out.println(solution.fourSum(new int[] { 2, 2, 2, 2, 2 }, 8));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return null;
        }
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    return result;
                }
                int m = j + 1;
                int n = len - 1;
                while (m < n) {
                    if (nums[i] + nums[j] + nums[m] + nums[n] == target) {
                        result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[m], nums[n])));
                        m++;
                        n--;
                        while (m < n && nums[m] == nums[m - 1]) {
                            m++;
                        }
                        while (m < n && nums[n] == nums[n + 1]) {
                            n--;
                        }
                    } else if (nums[i] + nums[j] + nums[m] + nums[n] > target) {
                        n--;
                        while (m < n && nums[n] == nums[n + 1]) {
                            n--;
                        }
                    } else {
                        m++;
                        while (m < n && nums[m] == nums[m - 1]) {
                            m++;
                        }
                    }
                }
                while (nums[j] == nums[j + 1]) {
                    j++;
                    if (j >= len - 2) {
                        return result;
                    }
                }
            }
            while (nums[i] == nums[i + 1]) {
                i++;
                if (i >= len - 3) {
                    return result;
                }
            }
        }
        return result;
    }
}