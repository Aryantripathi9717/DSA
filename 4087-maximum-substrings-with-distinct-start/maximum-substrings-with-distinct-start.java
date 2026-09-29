class Solution {
    public int maxDistinct(String s) {
        int ans = 0;
        boolean[] seen = new boolean[26];
        for(char ch : s.toCharArray()){
            if(!seen[ch-'a']){
                ans++;
                seen[ch-'a'] = true;
            }
        }
        return ans;
    }
}