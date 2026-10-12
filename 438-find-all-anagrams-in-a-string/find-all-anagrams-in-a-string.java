class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int pfreq[] = new int[26];
        int freq[] = new int[26];
        List<Integer> result = new ArrayList<>();
        int left = -1;
        for(char ch : p.toCharArray()) pfreq[ch - 'a']++;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            if(i-left==p.length()){
                if(Arrays.equals(freq,pfreq)) result.add(i-p.length()+1);
                left++;
                freq[s.charAt(left)-'a']--;
            }
        }
        return result;
    }
}