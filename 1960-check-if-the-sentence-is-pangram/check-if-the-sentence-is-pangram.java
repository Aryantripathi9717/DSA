class Solution {
    public boolean checkIfPangram(String sentence) {
        // simple method
        for(char start = 'a'; start<='z';start++){
            if(sentence.indexOf(start)==-1) return false;
        }
        return true;


        // boolean check[] = new boolean[26];
        // for(char c : sentence.toCharArray()) check[c-'a'] = true;

        // for(boolean ans : check){
        //     if(!ans) return false;
        // }
        // return true;
    }
}