class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map =  new HashMap<>();
        for(List<String> list : knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                int j = i+1;
                while(s.charAt(j)!=')'){
                    j++;
                }
                String str = s.substring(i+1,j);
                if(map.containsKey(str)){
                    ans.append(map.get(str));
                }else ans.append("?");
                i = j;
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();

        //giving tle and it's brute force
        // for(int i=0;i<s.length();i++){
        //     int check;
        //     if(s.charAt(i)=='('){
        //         check = i;
        //         String str = "";
        //         i++;
        //         while(s.charAt(i)!=')'){
        //             str += s.charAt(i);
        //             i++;
        //         }
        //         int flag = 0;
        //         StringBuilder sb = new StringBuilder(s);
        //         for(List<String> list : knowledge){
        //             if(list.get(0).equals(str)){
        //                 sb.replace(check,i+1,list.get(1));
        //                 flag = 1;
        //             }
        //         }
        //         if(flag==0) sb.replace(check,i+1,"?");
        //         s = sb.toString();
        //         i  = i - 2;
        //     }
        // }
        // return s;
    }
}