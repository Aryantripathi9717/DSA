class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i : candies){ 
            max = Math.max(i,max);
        }
        for(int i : candies){
            ans.add(i+extraCandies >= max);
        }
        return ans;
    }
}