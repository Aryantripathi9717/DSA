class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        for(int right=0; right < s.length() ; right++){
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(freq[s.charAt(right)-'A'],maxFreq);

            while((right-left+1)-maxFreq > k){
            freq[s.charAt(left)-'A']--;
            left++;
            }

            ans = Math.max(right-left+1,ans);
        }
        return ans;
    }
}