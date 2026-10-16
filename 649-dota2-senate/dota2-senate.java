class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();
        int n = senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R') radiant.offer(i);
            else dire.offer(i);
        }

        while(!radiant.isEmpty() && !dire.isEmpty()){
            int r = radiant.poll();
            int d = dire.poll();
            if(d>r){
                radiant.offer(n+r);
            }else dire.offer(d+n);
        }
        
        return dire.isEmpty() ? "Radiant" : "Dire";
    }
}