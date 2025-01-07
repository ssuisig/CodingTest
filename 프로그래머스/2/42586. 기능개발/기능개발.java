import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<speeds.length; i++){
            q.offer((int)Math.ceil((double)(100-progresses[i])/speeds[i]));
        }
        
        int days = q.poll();
        int count = 1;
        while(!q.isEmpty()){
            if(days < q.peek()){
                answer.add(count);
                days = q.poll();
                count=1;
            }
            else{
                count++;
                q.poll();
            }
            
        }
        answer.add(count);
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}