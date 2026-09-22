class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] curr = str.toCharArray();
            Arrays.sort(curr);
            String newStr = new String(curr);
            // one line word to add
            // map.computeIfAbsent(newStr,k->new ArrayList<>()).add(str); 

            if(!map.containsKey(newStr)) map.put(newStr,new ArrayList<>());
            map.get(newStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}