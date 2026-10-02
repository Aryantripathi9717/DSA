class Solution {
    public List<String> buildArray(int[] target, int n) {
        int[] result = new int[target.length];
        List<String> ans = new ArrayList<>();
        int k = 0;
        int num = 1;
        while(k<target.length){
            int tar = target[k];
            if(tar==num){
                ans.add("Push");
                num++;
            }else{
                while(num!=tar){
                    ans.add("Push");
                    ans.add("Pop");
                    num++;
                }
                ans.add("Push");
                num++;
            }
            k++;
            
        }
        return ans;
    }
}