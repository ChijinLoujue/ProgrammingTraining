import java.util.Arrays;

public class LeetCode16 {
    public static void main(String[] args) {
        int[] nums = { -100, -70, -60, 110, 120, 130, 160 };
        int target = 100;
        System.out.println(nums);
        System.out.println(target);
        LeetCode16 solution = new LeetCode16();
        System.out.println(solution.threeSumClosest(nums, target));
    }

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int len = nums.length;
        int result = nums[0] + nums[1] + nums[2];
        int closest = diff(result, target);
        // ordered the array, for 2 pointers algorithm
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (sumArray3(nums, i, j, k) == target) {
                    return target;
                }
                if (diff(sumArray3(nums, i, j, k), target) < closest) {
                    closest = diff(sumArray3(nums, i, j, k), target);
                    result = sumArray3(nums, i, j, k);
                }
                if (sumArray3(nums, i, j, k) > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }

    public int sumArray3(int[] nums, int i, int j, int k) {
        return nums[i] + nums[j] + nums[k];
    }

    public int diff(int x, int y) {
        if (x == y) {
            return 0;
        }
        if (x > y) {
            return x - y;
        }
        return y - x;
    }

}
