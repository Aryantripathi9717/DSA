class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=prices.length-1;i>=0;i--){
            while(!st.isEmpty() && prices[i]<st.peek()){
                st.pop();
            }
            int val = prices[i];
            prices[i] = st.isEmpty() ? prices[i] : prices[i] - st.peek();
            st.push(val);
        }
        return prices;
    }
}