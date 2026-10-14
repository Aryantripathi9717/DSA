class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i : students) q.offer(i);
        int index = 0;
        int flag = 0;
        while(!q.isEmpty() && flag == 0){
            int count = 0;
           if(sandwiches[index]==q.peek()){
                q.poll();
                index++;
           }else{
            while(sandwiches[index]!=q.peek()){
                count++;
                if(count==q.size()){
                    flag = 1;
                    break;
                }
                int num = q.poll();
                q.offer(num);
            }
           }
        }
        return q.size();

    }
}