class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            String temp = s.substring(i,i+k);
            int val = 0;
            for(int j=0;j<k;j++){
                val += temp.charAt(j)-'a';
            }
            ans.append((char)('a'+(val%26)));
        }
        return ans.toString();
    }
}