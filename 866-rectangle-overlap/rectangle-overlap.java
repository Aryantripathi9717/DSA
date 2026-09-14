class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int overlapHeight = Math.max(0,Math.min(rec1[2],rec2[2]) - Math.max(rec1[0],rec2[0]));
        int overlapWidth = Math.max(0,Math.min(rec1[3],rec2[3]) - Math.max(rec1[1],rec2[1]));
        if(overlapHeight > 0 && overlapWidth>0) return true;
        return false;
    }
}