class Solution {
    public String interpret(String command) {
        String ans = "";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G') ans += "G";
            else if(command.charAt(i)=='('){
                if(command.substring(i,i+2).equals("()")){
                    ans += "o";
                    i++;
                }else{
                    ans += "al";
                    i += 3;
                }
            }
        }
        return ans;
    }
}