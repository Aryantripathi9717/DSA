class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count = -1;
        int[] ans = new int[seq.length()];
        int i = 0;
        for(char ch : seq.toCharArray()){
            if(ch=='('){
                count++;
                ans[i++] = count%2;
            }else if(ch==')'){
                ans[i++] = count%2;
                count--;
            }
        }
        return ans;
    }
}