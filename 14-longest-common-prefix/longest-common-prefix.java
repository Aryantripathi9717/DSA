class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(str)){
                str = str.substring(0,str.length()-1);
            }
            if(str.isEmpty()) return str;
        }
        return str;

        //Simple Approach Brute Force
        // Arrays.sort(strs);
        // String first = strs[0];
        // String last = strs[strs.length-1];
        // String ans = "";
        // int i = 0;
        // while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
        //     ans += first.charAt(i);
        //     i++;
        // }
        // return ans;
    }
}