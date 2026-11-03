class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i : nums){
            sum += i;
            max = Math.max(i,max);
        }

        return max * nums.length - sum;
    }
}