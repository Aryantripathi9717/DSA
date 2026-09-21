class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        long ans = 0;
        for(int i : nums){
            ans += Math.abs(median-i);
        }
        return (int) ans;
    }
}