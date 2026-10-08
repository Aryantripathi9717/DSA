class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int index = st.pop();
                int height = heights[index];
                int width = st.isEmpty() ? i : i-st.peek()-1;
                int area = height * width;
                max = Math.max(max,area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int index = st.pop();
            int height = heights[index];
            int width = st.isEmpty() ? heights.length : heights.length-st.peek()-1;
            int area = height * width;
            max = Math.max(max,area);
        }
        return max;
    }
}