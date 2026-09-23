class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int count[] = new int[26];
        int count2[] = new int[26];
        for(char c : s1.toCharArray()) count[c-'a']++;
        int n = s1.length();
        for(int i=0;i<n;i++){
            count2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(count,count2)) return true;
        for(int i=n;i<s2.length();i++){
            count2[s2.charAt(i)-'a']++;

            count2[s2.charAt(i-n)-'a']--;

            if(Arrays.equals(count,count2)) return true;

        }
        return false;
    }
}