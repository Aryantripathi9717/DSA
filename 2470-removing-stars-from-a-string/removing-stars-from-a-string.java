class Solution {
    public String removeStars(String s) {
        int j = 0;
        char[] ans = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ans[i]=='*') j--;
            else {
                ans[j] = ans[i];
                j++;
            }
        }
        return new String(ans,0,j);
        // time complexity is very high
        // Stack<Character> stack = new Stack<>();
        // for(char c : s.toCharArray()){
        //     if(c=='*') stack.pop();
        //     else stack.push(c);
        // }
        // String ans = "";
        // while(!stack.isEmpty()){
        //     ans = stack.pop()+ans;
        // }
        // return ans;
    }
}