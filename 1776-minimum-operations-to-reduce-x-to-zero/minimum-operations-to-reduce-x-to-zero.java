class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int i : nums) sum += i;
        int sumRequired = sum - x;
        if(sumRequired==0) return nums.length;

        int currentSum = 0;
        int left = 0;
        int ans = -1;
        for(int right = 0; right<nums.length;right++){
            currentSum += nums[right];
            while(right>=left && currentSum>sumRequired){
                currentSum -= nums[left++];
            }
            if(currentSum==sumRequired){
                ans = Math.max(ans,right-left+1);
            }
        }       
        return ans == -1 ? -1 : nums.length-ans;
    }
}