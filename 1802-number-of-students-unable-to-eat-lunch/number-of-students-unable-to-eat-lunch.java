class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i : students) q.offer(i);
        int index = 0;


        while(!q.isEmpty()){
            int count = 0;
            while(count < q.size() && q.peek()!=sandwiches[index]){
                count++;
                q.offer(q.poll());
            }
            if(count==q.size()) break;
            q.poll();
            index++;
        }

        // this solution is can pass all the test case at this plateform but there is some edge case like what if my last element in queue is equals to front element in sandwiches for that case my solution won't work 

        // int flag = 0;
        // while(!q.isEmpty() && flag == 0){
        //     int count = 0;
        //    if(sandwiches[index]==q.peek()){
        //         q.poll();
        //         index++;
        //    }else{
        //     while(sandwiches[index]!=q.peek()){
        //         count++;
        //         if(count==q.size()){
        //             flag = 1;
        //             break;
        //         }
        //         int num = q.poll();
        //         q.offer(num);
        //     }
        //    }
        // }
        return q.size();

    }
}