class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[heights.length];
        for(int i = heights.length-1;i>=0;i--){
            int count = 1;
            while(!st.isEmpty() && heights[i]>st.peek()){
                count++;
                st.pop();
            }
            ans[i] = st.isEmpty() ? count-1 : count;
            st.push(heights[i]);
        }
        return ans;
    }
}