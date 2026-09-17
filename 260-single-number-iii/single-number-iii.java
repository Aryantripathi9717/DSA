class Solution {
    public int[] singleNumber(int[] nums) {
        int bit = 0;
        for(int num : nums) bit ^= num;

        int checkbit = bit & -bit;
        int a=0,b=0;

        for(int num : nums){
            if((checkbit & num)!=0) a ^= num;
            else b ^= num;
        }
        return new int[]{a,b};
    }
}