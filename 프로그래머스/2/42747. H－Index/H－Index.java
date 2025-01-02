import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i=0; i < citations.length; i++){
            System.out.println(citations[i]);
            if(citations[i] >citations.length-i){
                if(answer < citations.length-i)
                    answer = citations.length-i;
                break;
            }   
            answer = citations[i];
        }

        
        return answer;
    }
}