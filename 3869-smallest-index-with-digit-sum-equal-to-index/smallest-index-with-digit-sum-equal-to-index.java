class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10 && i == nums[i]) return i;
            else {
                int sum = 0;
                int n = nums[i];
                while(n>0){
                    sum += n % 10;
                    n /= 10;
                }
                if(sum==i) return i;
            }
        }
        return -1;
    }
}