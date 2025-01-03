import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(int i=0; i < clothes.length; i++){
            hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1],0)+1);
        }
        
        
        for(String i: hash.keySet()){
            System.out.println(hash.get(i));
            answer *= hash.get(i)+1;
        }
        
        return answer-1;
    }
}