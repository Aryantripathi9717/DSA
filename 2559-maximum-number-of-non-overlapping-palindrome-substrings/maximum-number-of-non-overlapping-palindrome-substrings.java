class Solution {
    public int maxPalindromes(String s, int k) {
        int ans = 0, n = s.length(), end = -1;
        for(int i=0;i<n;i++ ) {
            for(int r : new int[]{i,i+1}){
                int l = i;
                while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                    if(r-l+1 >= k && l>end){
                        ans++;
                        end = r;
                        break;
                    }
                    l--; r++;
                }
            }
        }
        return ans;
    }
}