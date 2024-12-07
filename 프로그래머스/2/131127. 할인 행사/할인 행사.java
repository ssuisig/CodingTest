import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> wantMap = new HashMap<>();
        for(int i=0; i< want.length; i++)
            wantMap.put(want[i], number[i]);
        
        Map<String, Integer> disMap = new HashMap<>();
        for(int i=0; i < 10; i++)
            disMap.put(discount[i], disMap.getOrDefault(discount[i],0)+1);
        if(check(disMap, wantMap) == 1)
            answer++;
        
        for(int i=10; i < discount.length; i++){
            disMap.put(discount[i], disMap.getOrDefault(discount[i], 0)+1);
            disMap.put(discount[i-10], disMap.getOrDefault(discount[i-10], 0)-1);
            if(disMap.get(discount[i-10]) == 0)
                disMap.remove(discount[i-10]);
            
            if(check(disMap, wantMap) == 1)
                answer++;
        }
        
        return answer;
    }
    public int check(Map<String, Integer> dis, Map<String, Integer> want){
        for(Map.Entry<String, Integer> e: want.entrySet()){
            String key = e.getKey();
            int w = e.getValue();
            int d = dis.getOrDefault(key, 0);
            
            if(w > d)
            return 0;
        }
        
        return 1;
    }
}