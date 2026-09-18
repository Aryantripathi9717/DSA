class Solution {
    public boolean digitCount(String num) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<num.length();i++){
            char key = (char)(i+'0');
            int ch = num.charAt(i)-'0';
            int val = map.getOrDefault(key,0);
            if(ch!=val) return false;
        }
        return true;
    }
}