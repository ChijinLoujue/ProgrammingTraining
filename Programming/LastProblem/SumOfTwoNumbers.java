class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numst[]=new int[2];
        for (int i = 1; i < nums.length; i++) {
            for(int j=0;j<i;j++)
            {
                if(nums[j]+nums[i]==target)
                {
                    numst[0]=j;
                    numst[1]=i;
                    i =j=nums.length;
                }
            }
        }
        return numst;
    }
}