class Solution {
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(ans.length());
            }else if(c==')'){
                int start = stack.pop();
                reverseString(ans,start,ans.length()-1);
            }else ans.append(c);
        }
        return ans.toString();
    }
    public void reverseString(StringBuilder result, int left, int right){
        while(left<right){
            char temp = result.charAt(left);
            result.setCharAt(left,result.charAt(right));
            result.setCharAt(right,temp);
            right--;
            left++;
        }
    }
}