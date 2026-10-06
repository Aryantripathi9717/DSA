class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = nums.length;
        for(int i=2*n-1;i>=0;i--){
            int current = nums[i%n];
            while(!st.isEmpty() && st.peek() <= current ) st.pop();
            if(i<n){
                nums[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(current);
        }
        return nums;
    }
}