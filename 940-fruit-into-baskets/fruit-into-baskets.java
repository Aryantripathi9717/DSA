class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        int left = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int right = 0; right<fruits.length; right++){
                int num = fruits[right];
                map.put(num,map.getOrDefault(num,0)+1);

                while(map.size()>2){
                    int fruit = fruits[left];
                    map.put(fruit,map.get(fruit)-1);
                    if(map.get(fruit)==0) map.remove(fruit);
                    left++;
                }
                ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}