class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        generatePermutation(nums,0);
        return result;
    }

    void generatePermutation(int[] nums, int index){
        if(index==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }
            result.add(list);
            return;
        }

        Set<Integer> set = new HashSet<>();
        for(int i = index; i<nums.length;i++){
            if(set.contains(nums[i])) continue;

            set.add(nums[i]);
            swap(nums,i,index);
            generatePermutation(nums,index+1);
            swap(nums,i,index);
        }

    }
    void swap(int[] nums, int i, int index){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}