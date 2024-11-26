import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int t: tangerine){
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        for(int i=0;k > 0;i++){
            k -= list.get(i).getValue();
            answer++;
        }
        
        return answer;
    }
}