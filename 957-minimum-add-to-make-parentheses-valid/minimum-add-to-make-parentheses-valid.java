class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='(') st.push(ch);
            else{
                if(st.isEmpty()) count++;
                else st.pop();
            }
        }
        count += st.size();
        return count;
    }
}