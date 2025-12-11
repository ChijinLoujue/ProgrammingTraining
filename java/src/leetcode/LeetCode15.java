import java.util.*;

class LeetCode15 {

    public static void main(String[] args) {
        int[] req = { -100, -70, -60, 110, 120, 130, 160 };
        System.out.println(req);
        LeetCode15 solution = new LeetCode15();
        System.out.println(solution.threeSum(req));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < length - 2; i++) {
            int j = i + 1;
            int k = length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else {
                    k--;
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
            while (i < length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result;
    }

}
