class Solution {
    public int bsl(int val, int[] arr, int d){
        int low = 0;
        int high = arr.length-1;

        int ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(val - arr[mid] > d){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public int bsr(int val, int[] arr, int d){
        int low = 0;
        int high = arr.length-1;

        int ans = high+1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]-val > d){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        // int m = arr2.length-1;     

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int c = 0;

        for(int i=0;i<n;i++){
            int r = bsr(arr1[i],arr2,d);
            int l = bsl(arr1[i],arr2,d);
            
            if(Math.abs(r-l)<=1){
                c++;
            }
        }
        return c;
    }
}