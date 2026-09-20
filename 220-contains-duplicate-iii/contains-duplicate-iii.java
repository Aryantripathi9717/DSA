class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        TreeSet<Long> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            long current = nums[i];
            Long check = set.ceiling(current-valueDiff);

            if(check != null && check <= current + valueDiff) return true;
            set.add(current);
            if(i>=indexDiff) set.remove((long)nums[i-indexDiff]);
        }
        return false;


        // giving TLE

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //         if(Math.abs(nums[i]-entry.getKey())<= valueDiff && Math.abs(i-entry.getValue())<=indexDiff) return true;
        //     }
        //     map.put(nums[i],i);
        // }
        // return false;
    }
}