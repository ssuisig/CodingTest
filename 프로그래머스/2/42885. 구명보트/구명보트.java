import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int j = 0;
        
        Arrays.sort(people);
        
        for(int i=0; i<people.length; i++){
            if(people[j]+people[people.length-i-1] >limit)
                answer++;
            else{
                answer++;
                j++;
            }
            if(j >= people.length-i-1)
                break;
        }
        
        return answer;
    }
}