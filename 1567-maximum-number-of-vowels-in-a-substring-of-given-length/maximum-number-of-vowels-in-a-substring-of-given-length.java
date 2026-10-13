class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int ans = 0;
        int count = 0;
        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u') count++;
            if(right-left+1 > k){
                ch = s.charAt(left);
                if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u') count--;
                left++;
            }
            if(right-left+1 == k) ans = Math.max(ans,count);
        }
        return ans;
    }
}