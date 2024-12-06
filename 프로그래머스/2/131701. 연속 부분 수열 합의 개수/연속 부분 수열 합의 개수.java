import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=1; i <= elements.length; i++){
            for(int j=0; j < elements.length;j++){
                int sum =0;
                for(int m=0; m<i; m++){
                    sum += elements[(j+m)% (elements.length)];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}