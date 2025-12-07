import java.util.*;

class LeetCode15{

    public static void main(String[] args) {
        int[] req = {-1, 0, 1, 2};

        System.out.println(new Solution().threeSum(req));
    }


}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null){
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if(length<3){
            return result;
        }
        Arrays.sort(nums);
        int i = 0;
        int j = length-1;
        for(int k = i+1; k<j ;){

            while(i<k && k<j){
                if(nums[i]+nums[k]+nums[j]==0){
                    List<Integer> temp = Arrays.asList(nums[i],nums[k],nums[j]);
                    result.add(temp);
                    break;
                }else{
                    if(nums[i]+nums[k]+nums[j]>0){
                        while(k<j){
                            j--;
                            if(nums[j]<nums[j+1]){
                                break;
                            }
                        }
                    }else{
                        while(i<k){
                            i++;
                            if(nums[i-1]<nums[i]){
                                break;
                            }
                        }
                    }
                }
            }
            i = 0;
            j = length-1;
            k++;
            // while(k<j){
            //     k++;
            //     if(nums[k-1]<nums[k]){
            //         break;
            //     }
            // }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(new Solution().threeSum(nums));
    }
}